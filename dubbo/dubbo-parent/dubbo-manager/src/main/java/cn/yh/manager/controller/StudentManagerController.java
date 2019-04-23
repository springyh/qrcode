package cn.yh.manager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yh.manager.service.StudentServiceManager;
import cn.yh.pojo.Student;

@Controller
public class StudentManagerController {
	@Resource
	private StudentServiceManager studentServiceImpl; 
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("sellAll")
	@ResponseBody
	public Object sellAllStu(){
		List<Student> list = studentServiceImpl.sellAll();
		if (list!=null && list.size() >0) {
			return list;
		}
		return null;
	}
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("login")
	@ResponseBody
	public Object login(){
		Student student = new Student();
		student.setSname("zs");
		student.setSpassword("123");
		int count = studentServiceImpl.sellStuByNameAndPwd(student);
		if (count >0) {
			return "success";
		}
		return "error";
	}
	
	
	
	
}
