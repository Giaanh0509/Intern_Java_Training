package org.example.configmappingfile;
import org.example.configmappingfile.util.HibernateUntil;
import org.example.configmappingfile.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("20214984", "Hoang Anh", "hoanganh0509@gmail.com", 21);

        Session session = HibernateUntil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(student);
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
