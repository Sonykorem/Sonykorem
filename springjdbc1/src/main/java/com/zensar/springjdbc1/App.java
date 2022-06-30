package com.zensar.springjdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zensar.springjdbc1.dao.StudentDao;
import com.zensar.springjdbc1.entity.Student;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args) {
		System.out.println("My Program started.....");
		ApplicationContext context = new ClassPathXmlApplicationContext(" com/zensar/springjdbc1/config.xml");
		StudentDao StudentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student();
		
		// INSERT
		// Student student=new Student();
		// student.setId(111);
		// student.setName("rama");
		// student.setAge(20);
		// int result = studentDao.insert(student);
		// System.out.println("student added"+result);

		// UPDATE
		// Student student=new Student();
		// student.setId(222);
		// student.setName("Ram");
		// student.setAge(23);
		// int result =StudentDao.change(student);
		// System.out.println("data changed"+result);

		// DELETE
		int result = StudentDao.deleteStudent(111);
		System.out.println("deleted" + result);
		
		
	}
}
