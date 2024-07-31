package org.example.configannotation;

import org.example.configannotation.model.Employee;
import org.example.configannotation.util.HibernateUntil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Testing CRUD operations
        testCRUDOperations();
    }

    public static void testCRUDOperations() {
        // Dùng cái nào thì uncomment đi

        // Create
//        Employee employee = new Employee("John", "Cena", "johncena9999@gmail.com");
//        int employeeId = createEmployee(employee);
//        System.out.println("Created Employee with ID: " + employeeId);

        // Read
//        Employee retrievedEmployee = readEmployee(3);
//        System.out.println("Retrieved Employee: " + retrievedEmployee.toString());

        // Get all employees
        List<Employee> retrievedEmployees = getAllEmployees();
        retrievedEmployees.forEach(e -> {
            System.out.println(e.toString());
        });

        // Update
//        retrievedEmployee.setEmail("updated-email@gmail.com");
//        retrievedEmployee.setLastName("Lmao");
//        updateEmployee(retrievedEmployee);
//        System.out.println("Updated Employee: " + retrievedEmployee);

        // Delete
//        deleteEmployee(retrievedEmployee.getId());
//        System.out.println("Deleted Employee with ID: " + retrievedEmployee.getId());
    }

    public static int createEmployee(Employee employee) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        Transaction transaction = null;
        int employeeId = -1;
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            employeeId = employee.getId();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeId;
    }

    public static Employee readEmployee(int employeeId) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        Employee employee = null;
        try {
            employee = session.get(Employee.class, employeeId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employee;
    }

    public static List<Employee> getAllEmployees() {
        List<Employee> employees = null;
        Session session = HibernateUntil.getSessionFactory().openSession();
        try {
            String hql = "FROM Employee";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            employees = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employees;
    }


    public static void updateEmployee(Employee employee) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(employee);
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

    public static void deleteEmployee(int employeeId) {
        Session session = HibernateUntil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, employeeId);
            if (employee != null) {
                session.delete(employee);
                transaction.commit();
            }
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
