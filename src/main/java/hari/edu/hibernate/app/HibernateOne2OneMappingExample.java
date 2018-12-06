package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Address;
import hari.edu.hibernate.pojo.Resident;
import hari.edu.hibernate.util.HibernateUtil;
import org.hibernate.Session;


public class HibernateOne2OneMappingExample {

    public static void main(String[] args) {
        Address address1=new Address();
        address1.setStreetNumber(21);
        address1.setStreetName("Rue de la Francs");
        address1.setCountry("Belgium");
        address1.setCity("Brussels");
        address1.setMailBoxNumber(16);

        Address address2=new Address();
        address2.setStreetNumber(18);
        address2.setStreetName("BOC Street");
        address2.setCountry("B Jenganathapuram");
        address2.setCity("Bodinayakanur");
        address2.setMailBoxNumber(2);

        Resident resident1 = new Resident();
        resident1.setName("Kumar");
        resident1.setAddress(address1);
        address1.setResident(resident1);

        Resident resident2 = new Resident();
        resident2.setName("Nandhini");
        resident2.setAddress(address2);
        address2.setResident(resident2);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(resident1);
        session.persist(resident2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
