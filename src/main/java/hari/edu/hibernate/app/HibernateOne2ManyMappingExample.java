package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Organisation;
import hari.edu.hibernate.pojo.RegularWorkers;
import hari.edu.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;

public class HibernateOne2ManyMappingExample {

    public static void main(String[] args) {
        RegularWorkers regularWorkers1 = new RegularWorkers();
        regularWorkers1.setName("Hari");
        RegularWorkers regularWorkers2 = new RegularWorkers();
        regularWorkers2.setName("Kumar");
        RegularWorkers regularWorkers3 = new RegularWorkers();
        regularWorkers3.setName("Kumban");
        RegularWorkers regularWorkers4 = new RegularWorkers();
        regularWorkers4.setName("Senthil");

        Organisation organisation1 = new Organisation();
        organisation1.setName("TCS");
        organisation1.setRegularWorkers(new ArrayList() {{
            add(regularWorkers1);
            add(regularWorkers2);
        }});
        regularWorkers1.setOrganisation(organisation1);
        regularWorkers2.setOrganisation(organisation1);

        Organisation organisation2 = new Organisation();
        organisation2.setName("CAPGEMINI");
        organisation2.setRegularWorkers(new ArrayList() {{
            add(regularWorkers3);
            add(regularWorkers4);
        }});
        regularWorkers3.setOrganisation(organisation2);
        regularWorkers4.setOrganisation(organisation2);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(organisation1);
        session.persist(organisation2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
