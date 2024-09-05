import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the second number ");
        float b = sc.nextFloat();
        System.out.println("what you want to do?");
        System.out.println("press  1 addition ");
        System.out.println("press  2 subtraction ");
        System.out.println("press  3 mutliply ");
        System.out.println("press  4 divide ");
        System.out.println("press  5 modules ");
        int c = sc.nextInt();
    switch (c) {
    case 1:
      System.out.println(a+b);
      break;
    case 2:
      System.out.println(a-b);
      break;
    case 3:
      System.out.println(a*b);
      break;
    case 4:
      System.out.println(a/b);
      break;
    case 5:
      System.out.println(a%b);
      break;
    
}
    }
}
