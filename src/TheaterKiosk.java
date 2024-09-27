import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Age = 0;
        String Trash = "";
        System.out.println("Enter your age.");

        if(in.hasNextInt())
        {
            Age = in.nextInt();
            in.nextLine();
        }
        else
        {
            Trash = in.nextLine();
            System.out.println("You entered " + Trash + " which is invalid.");
        }

        if(Age >= 21)
        {
            in.nextLine();
            System.out.println("Here is your wristband.");
        }
        else
        {
            System.out.println("You are not old enough.");
        }
    }
}