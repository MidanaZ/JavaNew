package classmate;

public class Main {
    public static void main (String[] args){
        Student stu = new Student("Trung",23,2000);
        Student stu2 = new Student("Son");
        StudentB stu3 = new StudentB("Son",21,1999);

        stu3.getnewInfo();

    }
}
