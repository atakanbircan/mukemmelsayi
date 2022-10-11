import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int deger,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        deger=input.nextInt();
        for (int i=1;i<deger;i++){
            if (deger%i==0){
                toplam+=i;
            }
        }
        if (toplam==deger){
            System.out.println(deger+" bir mükemmel sayıdır.");
        }
        else{
            System.out.println(deger+" mükemmel sayı değildir"  );
        }
    }
}