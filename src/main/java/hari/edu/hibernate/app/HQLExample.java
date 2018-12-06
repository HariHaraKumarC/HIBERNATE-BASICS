package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Resident;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class HQLExample {

    private static final Logger logger=Logger.getLogger(HQLExample.class);

    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();
        //TypedQuery query=session.createQuery("FROM Resident"); // Select Query Call
        TypedQuery query=session.createQuery("SELECT count (residentId) FROM Resident");
        //query.setFirstResult(1); // Fetch the result starting from row number 1
        //query.setMaxResults(3); // Fetch max 3 records.
        List<Resident> residentList= query.getResultList();
        /*logger.debug("Fetching the Resident Info from the database");
        residentList.forEach(resident -> logger.debug("Resident Details >> " +resident));*/
        logger.debug("Printing the number of Resident in the database " + residentList.get(0) );
        session.close();
        HibernateUtil.shutdown();
    }
}
