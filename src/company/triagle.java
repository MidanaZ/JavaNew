package company;

import java.util.Scanner;

public class triagle {
    int a;
    int b;
    int c;
    triagle(){

    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
    }
    public void checktamgiac(){
        if((a+b)>c && (a+c)>b &&(b+c)>a){
            System.out.println("La tam giac thường");
        }
        if(a==b && b==c){
            System.out.println("La tam giac đều");
        }else {
            System.out.println("nope tam giac");
        }
    }
    public void latamgiac(){
        if((a+b)>c && (a+c)>b &&(b+c)>a){
             System.out.println("Là tam giác");
        }else {
            System.out.println("Khong phai tam giac");
        }
    }
    public void tamgiacdeu(){
        if(a==b && b==c){
            System.out.println("là tam đều");
        }else {
            System.out.println("Là tam giac thuong");
        }
    }

}
