package classmate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        List<Student> stulist = new ArrayList<>();
        Student stu1 = new Student("Trung",22,2000);
        stulist.add(stu1);
        stu1 = new Student("Son",23,2000);
        System.out.println(stu1);




    }
}
