package com.spring.loppuprojekti.service;

import com.spring.loppuprojekti.data.Course;
import com.spring.loppuprojekti.data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    @Autowired
    ProjectFileService myFileService;

    public ProjectService() throws FileNotFoundException {
        courses = myFileService.readCoursesFromFile();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Course> getCourses(){
        return new ArrayList<>(courses);
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }

    public List<Course> getCoursesByTeacher(String teacher){
        List<Course> foundCourses = new ArrayList<>();

        for(Course c : courses){
            if(c.getTeacher().equals(teacher) ){
                foundCourses.add(c);
            }
        }
        return foundCourses;
    }


    public List<Student> getStudentsByClassNumber(String classNumber) {
        List<Student> foundStudents = new ArrayList<>();

        for(Student s : students){
            if(s.getClassNumber().equals(classNumber) ){
                foundStudents.add(s);
            }
        }
        return foundStudents;
    }
}
