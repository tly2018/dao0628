package com.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neuedu.pojo.Student;

public interface StudentDao {
	public List<Student> getStudents(); 
	public List<Student> getAll();
	public Student getOne(String sno);
	public int update(Student stu);
	public List<Student> gets();
}
