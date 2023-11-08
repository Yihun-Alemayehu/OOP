import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        // REVERSE STRING PROBLEM
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an String to reverse : ");
        String received = input.nextLine();
        String reversed = "";
        for (int i = 0; i < received.length() - 1; ++i) {
            received += received.charAt(i);
        }
        System.out.println("Received: " + received);
        System.out.println("Reversed: " + reversed);

    }
}