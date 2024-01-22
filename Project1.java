import java.util.Scanner;
import java.lang.String;

public class Project1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;
        String yes = "yes";
        String name;
        int age;
        int feet;
        int inches;

        do { 
            System.out.println("Enter player information");

            System.out.println("Enter name");
            name = input.next(); //ensure only letters

            System.out.println("Enter age");
            age = input.nextInt();

            System.out.println("Enter height (feet first then inches)");
            System.out.println("Enter feet");
            feet = input.nextInt();
            System.out.println("Enter inches"); //deal with double types
            inches = input.nextInt();
            
            System.out.println("Have another player to add? Enter yes or no");//ensure yes or no and take upper or lower
            answer = input.next();

            
        } while (answer.equalsIgnoreCase(yes));
    }
}