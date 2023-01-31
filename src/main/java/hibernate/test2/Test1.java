package hibernate.test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Anastasia", "Khodakina",
                    "Medicine", 35000);
            Detail detail = new Detail("Kaluga", "1111111112", "khodakina955@yadex.ru");
            employee.setEmpDetail(detail);
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }
}
