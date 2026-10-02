import java.util.Scanner;

public class inputPrima {
    public static void main(String[] args) throws InterruptedException {
        int angka;
        boolean prima;
        int angkaPrima;
        int langkah;
        int pembagi;


        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        angka = input.nextInt(); // 5

        langkah = 1; // 1, 2, 3, 3, 
        angkaPrima = 2; // 2, 3, 4, 5, 
        // pembagi = 2, 2, 2, 3
        while (langkah <= angka) {
            prima = true;
            for (pembagi = 2 ; (pembagi * pembagi) <= angkaPrima ; pembagi++ ) {
                if (angkaPrima % pembagi == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.printf("%d ", angkaPrima);
                langkah++
            }
            
            angkaPrima++;
        }
        System.out.println("");

    }
}