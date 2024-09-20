import java.util.Scanner;

class Candidate {
    int Rno;
    String Name, Remarks;
    float Score;

    // Method to enter details
    void Enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll number: ");
        Rno = sc.nextInt();
        System.out.println("Enter the name: ");
        Name = sc.next();
        System.out.println("Enter the score: ");
        Score = sc.nextFloat();
    }

    // Method to assign remarks based on score
    void AssignRem() {
        if (Score >= 50) {
            Remarks = "Selected";
        } else {
            Remarks = "Not Selected";
        }
    }

    // Method to display the details
    void Display() {
        AssignRem(); // Call AssignRem() to set the Remarks before displaying
        System.out.println(Rno + " " + Name + " " + Score + " " + Remarks);
    }

    // Inner class with main method
    public static class InnerCandidate {
        public static void main(String[] args) {
            Candidate c1 = new Candidate();
            c1.Enter();
            c1.Display();
        }
    }
}
