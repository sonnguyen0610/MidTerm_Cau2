import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap mat khau: ");
        String s=sc.nextLine();
        Cau2 cau2=new Cau2();
        if(cau2.checkLenght(s)){
            if(cau2.checkUpper(s)){
                if(cau2.checkNumber(s)){
                    System.out.println("Mk oke");
                }else {
                    System.out.println("Mat khau chua du manh");
                }
            }else {
                System.out.println("Mat khau chua du manh");
            }
        }else {
            System.out.println("Mat khau yeu");
        }
    }
}
