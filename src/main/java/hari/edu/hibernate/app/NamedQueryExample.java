package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Resident;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import javax.persistence.TypedQuery;

public class NamedQueryExample {

    private static final Logger logger=Logger.getLogger(NamedQueryExample.class);

    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();
        TypedQuery query=session.getNamedQuery("findResidentByName");
        query.setParameter("name","Hari");
        query.getResultList().forEach(resident -> logger.debug("Resident Info : "+resident));
        session.close();
        HibernateUtil.shutdown();
    }
}
