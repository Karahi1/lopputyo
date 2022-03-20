package com.spring.loppuprojekti.controller;

import com.spring.loppuprojekti.data.Course;
import com.spring.loppuprojekti.data.Student;
import com.spring.loppuprojekti.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectRestController {


    @Autowired
    ProjectService myProjectService;

    @GetMapping("courses")
    public List<Course> getCourses(){
        return myProjectService.getCourses();
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return myProjectService.getStudents();
    }

    @GetMapping("courses/{teacher}")
    public List<Course> getTeacherCourses(@PathVariable String teacher){
        return myProjectService.getCoursesByTeacher(teacher);
    }

    @GetMapping("students/{classNumber}")
    public List<Student> getClassNumberStudents(@PathVariable String classNumber){
        return myProjectService.getStudentsByClassNumber(classNumber);
    }

    @PostMapping("addstudent")
    public String addStudent(@RequestBody Student student){
        myProjectService.addStudent(student);
        return "Lisäys onnistui";
    }

    @PostMapping("addcourse")
    public String addCourse(@RequestBody Course course){
        myProjectService.addCourse(course);
        return "Lisäys onnistui";
    }



}
