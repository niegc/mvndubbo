package com.ngc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.ngc.service.StudentService;


@Controller
@RequestMapping("/")
public class WelcomeController {
	
	private static final Log LOG = LogFactory.getLog(WelcomeController.class);
	
	@Resource(name="studentService")
	private StudentService ss;
	
	@RequestMapping("/abc")
	public String  welcome(Model model){
		
		System.out.println("AAAAAAAAAAA");
		return "welcome";
		
	}
	
	
	@RequestMapping("listStudent")
	public String listStudent(Model model){
		
		LOG.info("This is getAllStudent info");
		
		model.addAttribute("stu",ss.getAllStudent());
					
		return "list_student";
	}
	
	
	@RequestMapping("list_onestudent")
	public String listOneStudent(Model model,String myid){
		
		LOG.info("This is getOneStudent");
		model.addAttribute("student",ss.getOneStudent(Long.parseLong(myid)));
		return "list_student";
				
		
	}
	
	
	

}
