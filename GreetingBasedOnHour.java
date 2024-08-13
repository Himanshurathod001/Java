import java.util.Scanner;

public class GreetingBasedOnHour {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the hour (0-23): ");
        int hour = scanner.nextInt();
        
   
        if (hour >= 0 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Afternoon");
        } else if (hour >= 18 && hour < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Time is out of range");
        }
        

        scanner.close();
    }
}
