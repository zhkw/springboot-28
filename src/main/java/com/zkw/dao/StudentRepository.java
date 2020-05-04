package com.zkw.dao;

import com.zkw.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
        List<Student> result = jdbcTemplate.query(
                "SELECT id,name FROM CUX.CUX_STUDENT",
                (rs,rowNum)->new Student(rs.getInt("id"), rs.getString("name"))
        );
        return result;
    }

}
