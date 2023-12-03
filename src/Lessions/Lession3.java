package Lessions;
import java.util.Scanner;
public class Lession3 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введите количество для последовательности");
        int n = in.nextInt();
        int[] mass = new int[n];
        mass[0]=1;
        mass[1]=1;
        System.out.println(mass[0]);
        System.out.println(mass[1]);
        for(int i =2; i<n;i++){
            mass[i]=mass[i-1]+mass[i-2];
            System.out.println(mass[i]);
        }
//        int i=2;
//        while(i< mass.length){
//            mass[i]=mass[i-1]+mass[i-2];
//            System.out.println(mass[i]);
//            i++;
//        }
    }
}
