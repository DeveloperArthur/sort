package Java_package;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public void ordenaInteiro() {
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
        int aux = 0;
        Scanner sci = new Scanner(System.in);
        System.out.println("digite o tamanho do array inteiro: ");
        int lengthArray = sci.nextInt();
        int arrayInt[] = new int[lengthArray];

        for (int i = 0; i < lengthArray; i++) {
            System.out.println("de valor para posicao [" + i + "]:");
            arrayInt[i] = sci.nextInt();
        }

        for (int j = 0; j < lengthArray; j++) {
            for (int k = 0; k < lengthArray; k++) {
                if (arrayInt[j] < arrayInt[k]) {
                    aux = arrayInt[j];
                    arrayInt[j] = arrayInt[k];
                    arrayInt[k] = aux;
                }
            }
        }
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
        System.out.println("Array de inteiros ordenado abaixo");
        for (int l = 0; l < lengthArray; l++) {
            System.out.println(arrayInt[l]);
        }

    }

    public void ordenaCaracter() {
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
        char aux;
        Scanner sci = new Scanner(System.in);
        System.out.println("digite quantos caracteres deseja ordenar");
        int lengthArrayChar = sci.nextInt();
        char[] array = new char[lengthArrayChar];

        for (int m = 0; m < lengthArrayChar; m++) {
            System.out.println("de valor para posicao [" + m + "]:");
            array[m] = sci.next().charAt(0);
        }

        //bubble sort
        for (int j = 0; j < lengthArrayChar; j++) {
            for (int k = 0; k < lengthArrayChar; k++) {
                if (array[j] < array[k]) {
                    aux = array[j];
                    array[j] = array[k];
                    array[k] = aux;
                }
            }
        }
        
        for (int i = 0; i < 100; ++i) {
            System.out.println();
        }
        System.out.println("Array de caracter ordenado abaixo");
        for (int n = 0; n < lengthArrayChar; n++) {
            System.out.println(array[n]);
        }

    }

}
