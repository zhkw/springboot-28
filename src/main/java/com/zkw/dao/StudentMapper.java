package com.zkw.dao;

import com.zkw.domain.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student stu = new Student();
        stu.setId(rs.getInt("ID"));
        stu.setName(rs.getString("NAME"));
        return stu;
    }
}
