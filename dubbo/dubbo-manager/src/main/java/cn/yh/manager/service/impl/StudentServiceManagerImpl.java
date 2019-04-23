package cn.yh.manager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.yh.manager.service.StudentServiceManager;
import cn.yh.pojo.Student;
import cn.yh.service.StudentService;
@Service
public class StudentServiceManagerImpl implements StudentServiceManager {
	@Reference
	private StudentService studentServiceImpl;
	@Override
	public List<Student> sellAll() {
		return studentServiceImpl.sellAllStu();
	}
	@Override
	public int sellStuByNameAndPwd(Student student) {
		return studentServiceImpl.sellStuByNameAndPwd(student);
	}
	
}
