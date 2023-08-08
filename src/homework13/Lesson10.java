package homework13;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch (age){
            case "0" :
                System.out.println("Ты родился");
                break;
            case "6" :
                System.out.println("Ты пошёл в школу");
                break;
            case "17" :
                System.out.println("Ты закончил школу");
                break;
        }
    }
}

