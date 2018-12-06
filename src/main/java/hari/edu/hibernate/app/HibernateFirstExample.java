package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Book;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class HibernateFirstExample {

    private static final Logger logger=Logger.getLogger(HibernateFirstExample.class);

    public static void main(String[] args) {
        Book book1=new Book();
        book1.setId(7);
        book1.setAuthorId(2);
        book1.setLanguageId(1);
        book1.setName("Paarthiban Kanavu");
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        logger.debug("Inserting the book1 into the database."+book1);
        session.save(book1);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
