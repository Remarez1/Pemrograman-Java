import java.util.Scanner;

public class Array {

    public int Panjang1(int param1) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang Array1: ");
        param1 = input.nextInt();
        return param1;
    }

    public int Panjang2(int param2) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang Array2: ");
        param2 = input.nextInt();
        return param2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjangArray1, panjangArray2;
        int i, j;
        float[] Array1, Array2;
        Array myObj = new Array();
        panjangArray1 = myObj.Panjang1(0);
        Array1 = new float[panjangArray1];
        System.out.println("-----------------------");
        for (i = 0; i < panjangArray1; i++) {
            System.out.print("Masukkan nilai Array1 [" + i + "]: ");
            Array1[i] = input.nextFloat();
            input.nextLine();
        }

        System.out.println("");
        System.out.println("-----------------------");
        panjangArray2 = myObj.Panjang2(0);
        Array2 = new float[panjangArray2];
        for (j = 0; j < panjangArray2; j++) {
            System.out.print("Masukkan nilai Array2 [" + j + "]: ");
            Array2[j] = input.nextFloat();
            input.nextLine();
        }

        System.out.println("=============================\n");
        System.out.println("Nilai Array1 Adalah: ");
        Hasil(Array1);
        System.out.println("");
        System.out.println("Nilai Array2 Adalah: ");
        Hasil(Array2);

    }

    static void Hasil(float[] output) {
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}