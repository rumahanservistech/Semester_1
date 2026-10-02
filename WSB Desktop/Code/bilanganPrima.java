import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) throws InterruptedException {
        int n;
        int kandidat;
        int tercetak;
        int pembagi;
        boolean prima;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan prima: ");
        n = input.nextInt();

        if (n < 1) {
            System.out.println("Jumlah harus lebih besar dari 0");
            return;
        }

        kandidat = 2;
        tercetak = 0;

        while (tercetak < n) {
            prima = true;
            for (pembagi = 2; pembagi * pembagi <= kandidat; pembagi++) {
                if (kandidat % pembagi == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.printf("%d", kandidat);
                tercetak++;
                if (tercetak < n) {
                    System.out.print(", ");
                }
            }

            kandidat++;
        }

        System.out.println("");
        System.out.println("Total: " + tercetak);
    }
}
