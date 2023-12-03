package Lessions;
import java.util.Arrays;
import java.util.Scanner;
public class Lession7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numb = 7;
        char[] mass = new char[]{'a','c','e','g','i','k','m','o','q','s'};
        char[] newMass =  new char[numb];
        int i=0;
        while(i<numb){
            newMass[i]=mass[i];
            i++;
        }
        System.out.println(Arrays.toString(newMass));
        i=numb-1;
        while(i>=0){
            System.out.println(newMass[i]);
            i--;
        }
    }
}
