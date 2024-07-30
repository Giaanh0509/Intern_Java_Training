package org.example.configannotation;

import org.example.configannotation.model.Employee;
import org.example.configannotation.util.HibernateUntil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Hoang", "Anh", "hoanganh0509@gmail.com");

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