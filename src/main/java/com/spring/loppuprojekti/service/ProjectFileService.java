package com.spring.loppuprojekti.service;

import com.spring.loppuprojekti.data.Course;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class ProjectFileService {
    public void writeCoursesToFile(List<Course> courses) throws IOException {
        FileWriter fw = new FileWriter(new File("courses.txt"));
    }

    public List<Course> readCoursesFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("courses.txt"));
        List<Course> courses = new ArrayList<>();

        return courses;
    }


}
