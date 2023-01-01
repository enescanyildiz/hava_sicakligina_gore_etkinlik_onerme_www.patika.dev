import java.util.Scanner;

public class  Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik > 5) {
            if (sicaklik < 15) {
                System.out.println("Sinemaya Gidebilirsin.");
                if (sicaklik > 10) {
                    System.out.print("Pikniğe Gidebilirsin.");
                }
            } else if (sicaklik < 25) {
                System.out.print("Pikniğe Gidebilirsin.");
            } else {
                System.out.print("Yüzmeye Gidebilirsin.");
            }
        } else {
            System.out.print("Kayak Yapabilirsin.");
        }
    }
}