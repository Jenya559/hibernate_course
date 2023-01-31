package hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
//            Employee employee=session.get(Employee.class,8);
//            employee.setSalary(1);
            session.createQuery("update Employee set salary = 100000 "+ " where name ='Evgeniy'").executeUpdate();
            transaction.commit();
            System.out.println("Done!");
        }
    }
}
