import java.util.Scanner;

public class pangkatrekursif {

    public static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) return 1;
        return bilangan * hitungPangkat(bilangan, pangkat - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan: ");
        int bilangan = input.nextInt();

        System.out.print("Input pangkat: ");
        int pangkat = input.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println("Hasil " + bilangan + " pangkat " + pangkat + " = " + hasil);
    }
}