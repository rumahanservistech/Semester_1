import java.util.Scanner;

public class OperatorBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan b: ");
        int b = input.nextInt();

        // Operator bitwise
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int not = ~a;
        int shiftKiri = a << 2;
        int shiftKanan = a >> 2;

        System.out.println();
        System.out.println("-------------Hasil Operator Bitwise-------------");
        System.out.println();

        System.out.println("a = " + a + " -> biner: " + Integer.toBinaryString(a));
        System.out.println("b = " + b + " -> biner: " + Integer.toBinaryString(b));
        System.out.println();

        System.out.println("AND   a & b  = " + and + " -> biner: " + Integer.toBinaryString(and));
        System.out.println("OR    a | b  = " + or + " -> biner: " + Integer.toBinaryString(or));
        System.out.println("XOR   a ^ b  = " + xor + " -> biner: " + Integer.toBinaryString(xor));
        System.out.println("NOT   ~a     = " + not + " -> biner: " + Integer.toBinaryString(not));
        System.out.println("Shift kiri  a << 2 = " + shiftKiri + " -> biner: " + Integer.toBinaryString(shiftKiri));
        System.out.println("Shift kanan a >> 2 = " + shiftKanan + " -> biner: " + Integer.toBinaryString(shiftKanan));
    }
}