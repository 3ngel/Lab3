package Lessions;
import java.util.Scanner;
public class Lession2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = in.nextLine();
        day = day.toLowerCase();
        switch (day){
            case("понедельник"):
                System.out.println("Один");
                break;
            case("вторник"):
                System.out.println("два");
                break;
            case("среда"):
                System.out.println("три");
                break;
            case("четверг"):
                System.out.println("четыре");
                break;
            case("пятница"):
                System.out.println("пять");
                break;
            case("суббота"):
                System.out.println("шесть");
                break;
            case("воскреснье"):
                System.out.println("семь");
                break;
            default:
                System.out.println("Такого дня не существует");
                break;
        }

    }
}
