import java.util.Scanner;

public class inputGanjilGenap {
    public static void main(String[] args) throws InterruptedException {
        int angka;
        int langkah;
        int pecah;
        int angkaGenap;
        int angkaGanjil;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        pecah = angka % 2;

        if (pecah == 0) {
            System.out.println("Genap");
            angkaGenap = 2;
            for (langkah = 1 ; langkah <= angka ; langkah++) {
                System.out.printf("%d, ", angkaGenap);
                angkaGenap+=2;
            }
            System.out.println("");
        } else {
            System.out.println("Ganjil");
            angkaGanjil = 1;
            for (langkah = 1 ; langkah <= angka ; langkah++) {
                System.out.printf("%d, ", angkaGanjil);
                angkaGanjil+=2;
            }
            System.out.println("");
        }
    }
}