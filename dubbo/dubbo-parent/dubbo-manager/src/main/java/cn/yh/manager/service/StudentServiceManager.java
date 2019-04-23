package cn.yh.manager.service;

import java.util.List;

import cn.yh.pojo.Student;

public interface StudentServiceManager {
	List<Student> sellAll();
	int sellStuByNameAndPwd(Student student);
}
