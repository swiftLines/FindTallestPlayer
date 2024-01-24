import java.util.Scanner;
import java.lang.String;

public class Project1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String yes = "yes";
        String answer;
        String name;
        int age;
        int feet;
        int inches;
        int count = 0;
       //ArrayList<Player> player = new ArrayList<>();

        do { 
            System.out.println("Enter player information");

            System.out.println("Enter name");
            name = input.next(); //ensure only letters and keep to less than certain amount of chars

            System.out.println("Enter age");
            age = input.nextInt();

            System.out.println("Enter height (feet first then inches)");
            System.out.println("Enter feet");
            feet = input.nextInt();
            System.out.println("Enter inches"); //deal with double types
            inches = input.nextInt();
            //player.add.(player(name,age,feet,inches));
            //Player one = new Player(name, age, feet, inches);
            //count++;

            System.out.println("Have another player to add? Enter yes or no");
            answer = input.next(); //ensure yes or no and take upper or lower

            
        } while (answer.equalsIgnoreCase(yes));
        Player one = new Player(name, age, feet, inches);
        //Do a get height test
        System.out.println(name);
    }
}