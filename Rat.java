import java.util.Scanner;

public class Rat {
    public static void main(String[] doc) {
        Scanner zen = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = zen.nextInt();

        if(age < 0) {
            System.out.println("age cann't be negative");
        } else if(age < 18){
            System.out.println("You cann't go.");
        } else {
            System.out.println("you can go.");
        }
    } 
}