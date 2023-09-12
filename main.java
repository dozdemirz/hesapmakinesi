import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double s1, s2;
        int islem;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz :");
        s1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz :");
        s2 = input.nextDouble();

        System.out.println(
                "Yapmak istediğiniz işlemin numarasını giriniz:\n 1. Toplama \n 2. Çıkarma \n 3. Çarpma \n 4. Bölme ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam: " + (s1 + s2));
                break;
            case 2:
                System.out.println("Kalan :" + (s1 - s2));
                break;
            case 3:
                System.out.println("Çarpma :" + (s1 * s2));
                break;
            case 4:
                System.out.println("Bölüm :" + (s1 / s2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");

        }

    }

}