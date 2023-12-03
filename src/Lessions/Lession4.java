package Lessions;
import java.util.Scanner;
public class Lession4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало последовательности");
        int start = in.nextInt();
        System.out.println("Введите конец последовательности");
        int end = in.nextInt();
        for(int i=start; i<=end;i++){
            System.out.println(i);
        }
//        while(start<=end){
//            System.out.println(start);
//            start++;
//        }
    }
}
