package com.ensup.master.serviceImpl;

import java.util.List;

import com.ensup.master.dao.IStudentDao;
import com.ensup.master.metier.Course;
import com.ensup.master.metier.Student;

/**
 * StudentService
 * 
 * @author DANON
 *
 */
public class StudentService {

	IStudentDao dao;
	
	public StudentService(IStudentDao dao) {
		this.dao = dao;
	}

	/**
	 * Read all informations of all students
	 * @return List<Student>
	 */
	 
	public List<Student> readAllStudent() {
		return dao.readAllStudent();
	}

	/**
	 * Upadate a student information
	 * @param student
	 */
	public void updateEtudiant(Student student) {
		dao.updateEtudiant(student);
	}

	/**
	 * delete a student information
	 * @param i
	 */
	public void deleteStudent(Student student) {
		dao.deleteStudent(student);		
	}

	/**
	 * get a student information
	 * @param student
	 * @return
	 */
	public Student getStudent(int i) {
		// TODO Auto-generated method stub
		return dao.getStudent(i);
	}
}
