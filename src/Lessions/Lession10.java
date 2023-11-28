package Lessions;
import java.util.Random;
import java.util.Arrays;
public class Lession10 {
    public static void main(String[] args){
        int[] mass = new int[10];
        Random x = new Random();
        for(int i=0; i<mass.length; i++){
            mass[i]=x.nextInt(200);
        }
        int[] newmass = new int[10];
        Arrays.sort(mass);
        for(int i=9; i>=0; i--){
            newmass[9-i]=mass[i];
        }
        System.out.println(Arrays.toString(newmass));
    }
}
