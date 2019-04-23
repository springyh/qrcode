package cn.yh.service;

import java.util.List;

import cn.yh.pojo.Student;

public interface StudentService {
	/**
	 * 查询所有stu
	 * @return
	 */
	List<Student> sellAllStu();
	/**
	 * 根据名字和密码,登录
	 * @param student
	 * @return
	 */
	int sellStuByNameAndPwd(Student student);
}
