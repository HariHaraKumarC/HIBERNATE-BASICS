package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Question;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import javax.persistence.TypedQuery;
import java.util.List;

public class HibernateFetchExample {

    private static final Logger logger=Logger.getLogger(HibernateFetchExample.class);

    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();

        TypedQuery query=session.createQuery("FROM Question");
        List<Question> questionList= query.getResultList();
        logger.debug("Fetching the Question Info from database");
        questionList.forEach(question -> logger.debug(question));

        session.close();
        HibernateUtil.shutdown();
    }
}
