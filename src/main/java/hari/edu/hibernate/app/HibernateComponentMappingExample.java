package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Car;
import hari.edu.hibernate.pojo.Engine;
import hari.edu.hibernate.util.HibernateUtil;
import org.hibernate.Session;


public class HibernateComponentMappingExample {

    public static void main(String[] args) {
        Engine engine1=new Engine("Petrol","Inline");
        Engine engine2=new Engine("Diesel","Flat");

        Car car1=new Car();
        car1.setCarColor("Blue");
        car1.setEngine(engine1);

        Car car2=new Car();
        car2.setCarColor("White");
        car2.setEngine(engine2);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(car1);
        session.persist(car2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
