import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau: ");
        String s = sc.nextLine();
        Cau2 cau2 = new Cau2();
        if (cau2.checkLenght(s)) {
            if (cau2.checkUpper(s)) {
                if (cau2.checkNumber(s)) {
                    if (cau2.checkSpecial(s)) {
                        System.out.println("Strong passwork");
                    } else {
                        System.out.println("Passwork is not enough strong");
                    }
                } else {
                    System.out.println("Passwork is not enough strong");
                }
            } else {
                System.out.println("Passwork is not enough strong");
            }
        } else {
            System.out.println("Weak passwork");
        }
    }
}
