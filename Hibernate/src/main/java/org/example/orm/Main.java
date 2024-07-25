package org.example.orm;

import org.example.orm.model.Employee;
import org.example.orm.util.HibernateUntil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John", "Doe", "john.doe@example.com");

        Session session = HibernateUntil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}