package com.ssm.controller;

import com.ssm.beans.Student;
import com.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 * @date 2018/1/29
 */
@SuppressWarnings("all")
public class StudentController {
    @Autowired
    @Qualifier("studentService")

    /**
     * // @Resource(name="studnetService")
     */
    private IStudentService service;
    public void setService(IStudentService service) {
        this.service = service;
    }
    @RequestMapping("/register.do") //传递的url是:http://localhost:8080/test/register.do
    public String doRegister(String name, int age) {
        Student student = new Student(name, age);
        service.addStudent(student);
        return "/welcome.jsp";
    }
}