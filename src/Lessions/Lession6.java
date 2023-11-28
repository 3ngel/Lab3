package Lessions;

import java.util.Scanner;

public class Lession6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int start = in.nextInt();
        int ij = -3;
        for(int i=0; i<start;i++){
            ij+=5;
            System.out.println(ij);
        }
    }
}
