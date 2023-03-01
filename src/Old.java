import java.sql.SQLOutput;
import java.util.Scanner;

public class Old {
    public static void main (String[] args){
        int year,tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bn nhập năm sinh");
        year = sc.nextInt();
        tuoi = 2023 - year;
        if(tuoi >0){
            System.out.println("Tuoi của bn hiện h là :"+tuoi);
        }else{
            System.out.println("Mời bn nhập lại");
        }
        //tuoi(year);
        /*if(tuoi(year)>0){
            System.out.println("Tuoi của bn hiện h là :"+tuoi(year));
        }else {
            System.out.println("mời bn nhập lại");
        }*/

    }
    /*public static int tuoi(int year){
        int t = 2023 - year;
        return t;

    }*/
}
