package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.Contractor;
import hari.edu.hibernate.pojo.Employer;

import hari.edu.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HibernateMany2ManyMappingExample {

    public static void main(String[] args) {

        Contractor contractor1=new Contractor(1,"Hari",450);
        Contractor contractor2=new Contractor(2,"Kumban",550);

        Employer employer1=new Employer(1,"TCS");
        employer1.setContractors(Stream.of(contractor1,contractor2).collect(Collectors.toSet()));
        Employer employer2=new Employer(2,"CAP");
        employer2.setContractors(Stream.of(contractor2).collect(Collectors.toCollection(HashSet::new)));

        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employer1);
        //session.save(employer2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
