package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Resident;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.TypedQuery;
import java.util.List;

public class HCQLExample {

    private static final Logger logger=Logger.getLogger(HCQLExample.class);

    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Resident.class,"resident");
        // Retrieve all the resident details
        //criteria.list().forEach(resident -> logger.debug("Resident Info : "+resident));
        // Retrieve with boundaries
        //criteria.setFirstResult(1);// Fetch the result starting from row number 1
        //criteria.setMaxResults(3); // Fetch max 3 records.
        //criteria.list().forEach(resident -> logger.debug("Resident Info : "+resident));
        //Retrieve the restrictions
        //criteria.createAlias("resident.address","address");
        //criteria.add(Restrictions.eq("address.city","Bodinayakanur"));
        //criteria.list().forEach(resident -> logger.debug("Resident Info : "+resident));
        //Ordering of data
        //criteria.addOrder(Order.asc("name"));
        //criteria.list().forEach(resident -> logger.debug("Resident Info : "+resident));
        //Setting Projection (Fetching only the particular column name)
        criteria.setProjection(Projections.property("name"));
        criteria.list().forEach(resident -> logger.debug("Resident Info : "+resident));
        session.close();
        HibernateUtil.shutdown();
    }
}
