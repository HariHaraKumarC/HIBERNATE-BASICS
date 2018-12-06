package hari.edu.hibernate.app;

import hari.edu.hibernate.pojo.ContractEmployee;
import hari.edu.hibernate.pojo.Employee;
import hari.edu.hibernate.pojo.RegularEmployee;
import hari.edu.hibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class HibernateInheritanceExample {

    private static final Logger logger=Logger.getLogger(HibernateFirstExample.class);

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setName("Kumban");

        RegularEmployee regularEmployee1=new RegularEmployee();
        regularEmployee1.setName("Kumar");
        regularEmployee1.setBonus(1280);
        regularEmployee1.setSalary(2900);

        ContractEmployee contractEmployee1=new ContractEmployee();
        contractEmployee1.setName("Senthil");
        contractEmployee1.setContractPeriodInMonths(12);
        contractEmployee1.setDailyRate(540);

        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        logger.debug("Inserting the employee details into the database.");
        session.persist(employee1);
        session.persist(regularEmployee1);
        session.persist(contractEmployee1);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
