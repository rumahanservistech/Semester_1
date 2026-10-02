public class IncrementDanDecrement {
    public static void main(String[] args) {
        int angka = 5;

        // INCREMENT
        // Increment adalah penambahan nilai sebesar 1 pada suatu tipe data numerik

        // PRE INCREMENT
        // Pre Increment adalah penambahan nilai sebesar 1 pada suatu tipe data numerik sebelum digunakan
        int preIncrement = ++angka;
        System.out.println(angka);
        System.out.println(preIncrement);
        angka = 5;

        // POST INCREMENT
        // Post Increment adalah penambahan nilai sebesar 1 pada suatu tipe data numerik setelah digunakan
        int postIncrement = angka++;
        System.out.println(angka);
        System.out.println(postIncrement);
        angka = 5;

        // Contoh 
        System.out.printf("Contoh Pre Increment : %d%n", preIncrement);
        
        System.out.printf("Contoh Post Increment : %d%n", postIncrement);

        System.out.println();

        // DECREMENT
        // Decrement adalah pengurangan nilai sebesar 1 pada suatu tipe data numerik

        // PRE DECREMENT
        // Pre Decrement adakah pengurangan nilai sebesar 1 pada suatu tipe data numerik sebelum digunakan
        int preDecrement = --angka;

        // POST DECREMENT
        // Post Decrement adalah pengurangan nilai sebesar 1 pada suatu tipe data numerik setelah digunakan
        int postDecrement = angka--;

        // Contoh
        System.out.printf("Contoh Pre Decrement : %d%n", preDecrement);
        System.out.printf("Contoh Post Decrement : %d%n", postDecrement);

    }
}