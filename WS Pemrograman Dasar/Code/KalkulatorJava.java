import java.util.Scanner;

public class KalkulatorJava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = input.nextInt();

        // proses perhitungan

        int penjumlahan = angkaPertama + angkaKedua;
        int pengurangan = angkaPertama - angkaKedua;
        
        int perkallian = angkaPertama * angkaKedua;
        double pembagian = angkaPertama / angkaKedua;
        int sisaBagi = angkaPertama % angkaKedua;
        
        // cetak hasil

        System.out.println();
        System.out.println("-----------Hasil Perhitungan-----------");
        System.out.println();

        System.out.printf("%d + %d = %d%n", angkaPertama, angkaKedua, penjumlahan);
        System.out.printf("%d - %d = %d%n", angkaPertama, angkaKedua, pengurangan);
        System.out.printf("%d * %d = %d%n", angkaPertama, angkaKedua, perkallian);
        System.out.printf("%d / %d = %.2f%n", angkaPertama, angkaKedua, pembagian);
        System.out.printf("%d %% %d = %d%n", angkaPertama, angkaKedua, sisaBagi);
        
    }
}
