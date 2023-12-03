package Lessions;
import java.util.Random;
import java.util.Arrays;
public class Lession9 {
    public static void main(String[] args){
        int[] mass = new int[10];
        Random r = new Random();
        int[] min = new int[]{};
        int mint = 200;
        for(int i =0; i < mass.length;i++) {
            mass[i] = r.nextInt(10);
             if(mint>mass[i]){
                 mint=mass[i];
             }
        }
        System.out.println(Arrays.toString(mass));
        for(int i =0;i<mass.length; i++){
               if(mint==mass[i]){
                    min = Arrays.copyOf(min,min.length+1);
                    min[min.length-1]=i;
               }
        }
        System.out.println(mint);
        System.out.println(Arrays.toString(min));
    }
}
