package com.example.SpringJDBC.repo;

import com.example.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into students (rollno,name,marks) values (?,?,?)";
        int rows = jdbc.update(sql,s.getRollno(),s.getName(),s.getMarks());
        System.out.println(rows+" effected");
    }

    public List<Student> findAll() {
        List<Student> stu = new ArrayList<>();
        return stu;
    }
}
