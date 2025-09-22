package com.itp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Student;
import com.itp.service.StudentService;

@Controller
public class TestController {
	
	@Autowired
	StudentService studService;
	
	@RequestMapping("/fruit")
	public String test()
	{
		return "apple";
	}
	
	@RequestMapping("/registerStudentForm")
	public String registerStudentForm(Model model)
	{
		Student s=new Student();
		model.addAttribute("student",s);
		return "register-student";
	}
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student) throws Exception
	{
		studService.insertStudent(student);
		System.out.println(student);
		ModelAndView mav=new ModelAndView();
		mav.addObject("stud",student.getSname());
		mav.setViewName("confirm");
		return mav;
	}
	
	@GetMapping("/allStudents")
	public String allStudent(Model model) throws Exception
	{	
		List<Student> students=new ArrayList();
		students=studService.allStudent();
		model.addAttribute("studentList",students);
		return "all-students";
	}

}
