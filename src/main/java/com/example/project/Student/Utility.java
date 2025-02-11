package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int compareLast = list.get(i).getLastName().compareTo(list.get(j).getLastName());
                int compareFirst = list.get(i).getFirsttName().compareTo(list.get(j).getFirstName());
                int compareGpa = list.get(i).getGpa() - list.get(j).getGpa();
                if (compareFirst != 0) {
                    if (compareFirst > 0) {
                        
                    }
                }
            }
        }
        return list;
    }


}
