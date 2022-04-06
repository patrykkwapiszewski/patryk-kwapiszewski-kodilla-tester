package com.koddila.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> students = new ArrayList<>();

    public School(String... students) {
        for (String student : students)
            this.students.add(student);
    }

    public int getAllStudents() {
        int i = 0;
        for (String student : students)
            i++;
        return i;
    }


}
