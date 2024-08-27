public class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Loop for rows
            for (int j = 1; j <= 5; j++) { // Loop for columns
                if (j == i) {
                    System.out.print(i); // Print the current row number at the diagonal
                } else {
                    System.out.print("1"); // Print 1 in all other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
