import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++){
            System.out.println("Ingrese el numero " + i + " del primer array");
            int num = sc.nextInt();
            array1[i] = num;
        }

        for (int i = 0; i < array1.length; i++){
            System.out.println("Ingrese el numero " + i + " del segundo array");
            int num = sc.nextInt();
            array2[i] = num;
        }

        int[] array3 = new int[5];

        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Primer array: " + Arrays.toString(array1));
        System.out.println("Segundo array: " + Arrays.toString(array2));
        System.out.println("Tercer array: " + Arrays.toString(array3));

    }
}
