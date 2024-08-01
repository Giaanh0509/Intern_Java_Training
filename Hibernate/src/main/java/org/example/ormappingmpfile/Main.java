package org.example.ormappingmpfile;
import org.example.ormappingmpfile.util.HibernateUntil;
import org.example.ormappingmpfile.model.Employee;
import org.example.ormappingmpfile.model.ParkingSpot;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Hoang Anh");
        ParkingSpot parkingSpot = new ParkingSpot("Parking lot A");
        parkingSpot.setEmployee(employee);
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
