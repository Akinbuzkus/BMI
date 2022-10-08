
import java.util.Scanner;


public class bmı {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz :");
        int kilo=scan.nextInt();
        System.out.print("Lütfen Boyunuzu Giriniz(1,80 cm) :");
        double boy=scan.nextDouble();
        
        double bki=kilo/(boy*boy);
        
        System.out.println("Beden Kitle İndeksiniz :"+bki);
    }
}
