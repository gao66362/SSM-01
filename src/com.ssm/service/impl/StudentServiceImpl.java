package com.ssm.service.impl;

import com.ssm.beans.Student;
import com.ssm.dao.IStudentDao;
import com.ssm.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 * @author admin
 * @date 2018/1/29
 */
@Service("studentService")
@SuppressWarnings("all")
public class StudentServiceImpl implements IStudentService {
    @Resource(name="IStudentDao")
    private IStudentDao dao;
    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }
    @Override
    @Transactional
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}