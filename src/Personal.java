import java.util.Scanner;

public class Personal {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        if(latamgiac(a,b,c)){
            System.out.println("La tam giac ");
            if(tamgiacdeu(a,b,c)){
                System.out.println("làm giac vuong");
            }
        }else {
            System.out.println("khong phải tam giác");
        }
    }
    public static boolean latamgiac(int a,int b, int c){
        if((a+b)>c && (a+c)>b &&(b+c)>a){
            return true;
        }else {
            return false;
        }
    }
    public static  boolean tamgiacdeu(int a, int b, int c){
        if(a == b && b == c){
            return true;
        }else {
            return false;
        }
    }

}
