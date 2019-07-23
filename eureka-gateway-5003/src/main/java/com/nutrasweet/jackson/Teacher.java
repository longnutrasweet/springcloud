package com.nutrasweet.jackson;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;

    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students=students;
    }
}
