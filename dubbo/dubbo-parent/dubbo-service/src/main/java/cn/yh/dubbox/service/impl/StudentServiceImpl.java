package cn.yh.dubbox.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;

import cn.yh.mapper.StudentMapper;
import cn.yh.pojo.Student;
import cn.yh.pojo.StudentExample;
import cn.yh.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentMapper studentMapper;
	@Override
	public List<Student> sellAllStu() {
		StudentExample example = new StudentExample();
		List<Student> list = studentMapper.selectByExample(example);
		if (list!=null && list.size() >0) {
			return list;
		}
		return null;
	}
	@Override
	public int sellStuByNameAndPwd(Student student) {
		StudentExample example = new StudentExample();
		example.createCriteria().andSnameEqualTo(student.getSname()).andSpasswordEqualTo(student.getSpassword());
		List<Student> list = studentMapper.selectByExample(example);
		if (list!=null && list.size() >0) {
			Student stu = list.get(0);
			if (stu!= null) {
				return 1;
			}
		}
		return 0;
	}

}
