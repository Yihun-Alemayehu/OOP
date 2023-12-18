import java.util.Scanner;

public class idk {
    public static void main(String args[]) {
        // int numDynamic;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter whatever you want ?");
        // numDynamic = input.nextInt();
        // System.out.print(numDynamic);

        // byte a = 64, b;
        // int i = a << 2;
        // b = (byte) (a << 2);
        // System.out.println(i);
        // System.out.println(b);

        // int a = -16;
        // System.out.println(a >> 3);

        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.println("The sum is : " + sum);
    }
}
