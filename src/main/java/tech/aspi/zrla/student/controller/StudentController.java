package tech.aspi.zrla.student.controller;

import org.springframework.web.bind.annotation.*;
import tech.aspi.zrla.student.model.Student;
import tech.aspi.zrla.student.service.StudentService;

import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    //保存数据
    @PostMapping("/save")
    public String save(Student student){
        studentService.save(student);
        return "SUCCESS";
    }

    @PostMapping("/delete")
    public String delete(String stu_id){
        studentService.delete(stu_id);
        return "SUCCESS";
    }

    @GetMapping("/findall")
    public Iterable<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findbyid")
    public Student findOne(String stu_id){
        return studentService.findOne(stu_id);
    }
}
