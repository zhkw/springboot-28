package com.zkw.dao;

import com.zkw.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
//        List<Student> result = jdbcTemplate.query(
//                "SELECT id,name FROM CUX.CUX_STUDENT",
//                (rs,rowNum)->new Student(rs.getInt("id"), rs.getString("name"))
//        );

//        List<Student> result = jdbcTemplate.query(
//                "SELECT id,name FROM CUX.CUX_STUDENT",
//                new BeanPropertyRowMapper(Student.class)
//        );

        List<Student> result = jdbcTemplate.query(
                "SELECT id,name FROM CUX.CUX_STUDENT",
                new StudentMapper()
        );
        return result;
    }

    public Student getById(Integer id){
        String sql = "SELECT id, name FROM CUX.CUX_STUDENT WHERE id = ?";
        Student stu = jdbcTemplate.queryForObject(sql,new Object[]{id},new StudentMapper());
        return stu;
    }

}
