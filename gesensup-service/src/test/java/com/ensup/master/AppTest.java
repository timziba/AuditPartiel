package com.ensup.master;

import org.mockito.Mockito;

import com.ensup.master.dao.ICourseDao;
import com.ensup.master.dao.IStudentDao;
import com.ensup.master.metier.Course;
import com.ensup.master.metier.Student;
import com.ensup.master.serviceImpl.CourseService;
import com.ensup.master.serviceImpl.StudentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	IStudentDao dao = Mockito.mock(IStudentDao.class);
	StudentService service = new StudentService(dao);
	
	@Test
	public void StudentAllListCheck() {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date()));

		Mockito.when(dao.readAllStudent()).thenReturn(list);

		List<Student> students = service.readAllStudent();

		Assertions.assertEquals(students.get(0).getFirstName(), "OBERLE");
		Mockito.verify(dao).readAllStudent();
	}

	}

	@Test
	public void studentCreationCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		service.createStudent(student);

		Mockito.verify(dao).createEtudiant(student);
	}

	@Test
	public void studentUpdateCheck() {
		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		service.updateEtudiant(etudiant);

		Mockito.verify(dao).updateStudent(etudiant);
	}

	@Test
	public void studentDeleteCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());
		
		service.deleteStudent(1);

		Mockito.verify(dao).deleteStudent(1);
	}

	@Test
	public void studentSelectCheck() {

		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());

		Mockito.when(dao.getStudent(student)).thenReturn(student);

		Student student = service.getStudent(student);

		Assertions.assertEquals(student.getId(), 1);
		Mockito.verify(dao).getStudent(student);
	}

	@Test
	public void studentCourseCreationCheck() {
		
		ICourseDao courseDao = Mockito.mock(ICourseDao.class);
		CourseService courseService = new CourseService(courseDao);
		
		Student student = new Student(1, "OBERLE", "François", "françois@yahoo.fr", "Saint cyr 10 rue des fermiers",
				"01 02 03 04 05", new Date());
		Course course = new Course("JAVA", 40);

		courseService.associateCourse(course, student.getId());

		Mockito.verify(courseDao).associateCourse(course, student.getId());
	}

}
