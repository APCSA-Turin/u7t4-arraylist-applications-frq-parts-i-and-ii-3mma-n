package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                double compareLast = list.get(i).getLastName().compareTo(list.get(j).getLastName());
                double compareFirst = list.get(i).getFirstName().compareTo(list.get(j).getFirstName());
                double compareGPA = list.get(i).getGpa() - list.get(j).getGpa();
                boolean later = false;
                if (compareLast != 0) {
                    if (compareLast > 0) {
                        later = true;
                    }
                } else if (compareFirst != 0) {
                    if (compareFirst > 0) {
                        later = true;
                    }
                } else {
                    if (compareGPA < 0) {
                        later = true;
                    }
                }
                if ((later && i < j)) {
                    list.add(i, list.remove(j));
                }
            }
        }
        return list;
    }
}
