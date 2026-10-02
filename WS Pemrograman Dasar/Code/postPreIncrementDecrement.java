public class postPreIncrementDecrement {
    public static void main(String[] args) {
        int angka = 5;

        // INCREMENT
        System.out.println("INCREMENT");
        System.out.println();

        System.out.println("--------------PRE INCREMENT---------------");
        int preIncrement = ++angka;
        System.out.println("hasil angka: " + angka); // Output 6
        System.out.println("hasil pre-increment: " + preIncrement); // Output 6
        angka = 5;
        // pre increment menambahkan nilai terlebih dahulu ke variabel angka 
        // lalu menambahkan ke variabel preIncrement
        System.out.println();

        System.out.println("--------------POST INCREMENT---------------");
        int postIncrement = angka++;
        System.out.println("hasil angka: " + angka); // Output 6
        System.out.println("hasil post-increment: " + postIncrement); // Output 5
        angka = 5;
        // post increment menambahkan nilai angka lama ke variabel postIncrement terlebih dahulu 
        // lalu menjumlahkan angka dan memasukkan nilai ke variabel angka
        System.out.println();

        // DECREMENT
        System.out.println("--------------PRE DECREMENT---------------");
        int preDecrement = --angka;
        System.out.println("hasil angka: " + angka); // Output 4
        System.out.println("hasil pre-decrement: " + preDecrement); // Output 4
        angka = 5;
        // pre decrement mengurangi nilai terlebih dahulu ke variabel angka 
        // lalu mengurangi ke variabel preDecrement
        System.out.println();

        System.out.println("--------------POST DECREMENT---------------");
        int postDecrement = angka--;
        System.out.println("hasil angka: " + angka); // Output 4
        System.out.println("hasil post-decrement: " + postDecrement); // Output 5
        angka = 5;
        // post decrement mengurangi nilai angka lama ke variabel postDecrement terlebih dahulu 
        // lalu mengurangi angka dan memasukkan nilai ke variabel angka
        System.out.println();
    }
}