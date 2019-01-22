package Java_package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sort ordenar = new Sort();
        
        Scanner op = new Scanner(System.in);
        System.out.println("1-INT");
        System.out.println("2-CHAR");
        int menu = op.nextInt();
        
        if (menu == 1){
            ordenar.ordenaInteiro();
        }
        else if (menu == 2){
            ordenar.ordenaCaracter();
        }
        

    }
}
