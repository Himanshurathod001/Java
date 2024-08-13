import java.util.Scanner;
public class Addtwonumers2 {
    public static void main (String [] args) {
        int num1, num2 , sum;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first number");
        num1 = sc.nextInt();
        System.out.println("enter sec num");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("sum of these numer"+ sum); 

    }
}