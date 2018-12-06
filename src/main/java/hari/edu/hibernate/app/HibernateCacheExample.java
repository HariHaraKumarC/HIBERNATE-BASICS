package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Resident;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import javax.persistence.TypedQuery;

public class HibernateCacheExample {

    private static final Logger logger=Logger.getLogger(HibernateCacheExample.class);

    public static void main(String[] args) {

        Session session1= HibernateUtil.getSessionFactory().openSession();
        Resident resident1=session1.load(Resident.class,1);
        logger.debug("Resident 1  Info : "+resident1);
        session1.close();
        Session session2= HibernateUtil.getSessionFactory().openSession();
        Resident resident2=session2.load(Resident.class,1);
        logger.debug("Resident 2  Info : "+resident2);
        session2.close();
        HibernateUtil.shutdown();
    }
}
