import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian (0-100): ");
        int nilai = input.nextInt();

        System.out.print("Masukkan persentase kehadiran (0-100): ");
        int kehadiran = input.nextInt();

        // Operator perbandingan (>=, <) dan logika (&&, ||, !)
        boolean nilaiLulus = nilai >= 75;
        boolean hadirLulus = kehadiran >= 80;
        boolean lulus = nilaiLulus && hadirLulus;

        System.out.println();
        System.out.println("-------------Hasil Kelulusan-------------");
        System.out.println();

        if (lulus) {
            System.out.println("LULUS");
            System.out.println("Kamu dinyatakan LULUS karena nilai ujian >= 75 dan kehadiran >= 80%.");
        } else if (!nilaiLulus) {
            System.out.println("TIDAK LULUS");
            System.out.println("Alasan: nilai ujianmu adalah " + nilai + " (kurang dari 75), sehingga nilai ujian < 75.");
            if (kehadiran < 80) {
                System.out.println("Selain itu, kehadiranmu adalah " + kehadiran
                        + "% (kurang dari 80%).");
            }
        } else if (!hadirLulus) {
            System.out.println("TIDAK LULUS");
            System.out.println("Alasan: kehadiranmu adalah " + kehadiran
                    + "% (kurang dari 80%), sehingga kehadiran < 80%.");
        }

        // Contoh penggunaan operator logika || (OR) dan ! (NOT)
        boolean adaKriteriaGagal = nilai < 75 || kehadiran < 80;
        System.out.println("Ringkasan: masih ada kriteria yang belum terpenuhi? " + !lulus
                + " (" + (!adaKriteriaGagal ? "tidak ada" : "ada") + ")");
    }
}