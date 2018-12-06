package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Question;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.*;

public class HibernateMappingExample {

    private static final Logger logger=Logger.getLogger(HibernateMappingExample.class);

    public static void main(String[] args) {

        Question question1=new Question();
        question1.setQuestionPosterName("Hari");
        question1.setQuestionName("What is Java?");

        Question question2=new Question();
        question2.setQuestionPosterName("Usha");
        question2.setQuestionName("What is Hibernate?");

        /*List<String> answersForQ1=new ArrayList<>(Arrays.asList("English","Tamil","Kannada"));
        List<String> answersForQ2=new ArrayList<>(Arrays.asList("Ponniyin Selvan","Kadal Pura","Yavana Rani"));

        question1.setAnswers(answersForQ1);
        question2.setAnswers(answersForQ2);*/

        /*Set<String> answersForQ1=new HashSet<>(Arrays.asList("English","Tamil","Kannada","Tamil"));
        Set<String> answersForQ2=new HashSet<>(Arrays.asList("Ponniyin Selvan","Kadal Pura","Yavana Rani","Kadal Pura"));

        question1.setAnswers(answersForQ1);
        question2.setAnswers(answersForQ2);*/

        Map<String,String> answersForQ1=new HashMap<>();
        answersForQ1.put("Java is a programming language","Hari");
        answersForQ1.put("Java is a Computer Language","Usha");

        Map<String,String> answersForQ2=new HashMap<>();
        answersForQ2.put("Hibernate is a ORM Language","Hari");
        answersForQ2.put("Hibernates implements JPA","Usha");

        question1.setAnswers(answersForQ1);
        question2.setAnswers(answersForQ2);

        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(question1);
        session.persist(question2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
