package com.example.mvc.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.mvc.entity.Student;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@Repository
@EnableTransactionManagement
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT s FROM Student s WHERE s.firstName <> ?1")
    public List<Student> findByFirstNameNot(String firstName);

    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query("update Student s set s.lastName= :lastName, s.firstName = :firstName, s.email = :email where s.id = :id")
    public void updateStudent(@Param("id") Integer id, @Param("lastName") String lastName, @Param("firstName") String firstName, @Param("email") String email);

    public Student findById(int id);
}
