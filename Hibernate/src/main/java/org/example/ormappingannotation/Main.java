package org.example.ormappingannotation;
import org.example.configmappingfile.util.HibernateUntil;
import org.example.ormappingannotation.model.Employee;
import org.example.ormappingannotation.model.ParkingSpot;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Hoang Anh");
        ParkingSpot parkingSpot = new ParkingSpot("Parking lot A", employee);
        employee.setParkingSpot(parkingSpot);

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
