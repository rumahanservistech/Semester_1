public class NestedLoop {
    public static void main(String[] args) throws InterruptedException {
        int baris;
        int kolom;

        for (baris = 1 ; baris <= 3 ; baris ++) {
            for (kolom = 1 ; kolom <= 4 ; kolom ++) {
                System.out.printf("%d ", kolom);
            }
            System.out.println("");
        }
    }
}