package Lessions;

import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args){
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner in= new Scanner(System.in);
        System.out.println("Введите номер для недели");
        int index = in.nextInt();
        System.out.println(week[index-1]);
    }
}
