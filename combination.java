import java.util.Scanner;

class Everithing {
    int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    int Permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    int Combination(int n, int r) {
        return factorial(n) / factorial(n - r) * factorial(r);
    }

}

public class combination {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.println("enter");
        n = input.nextInt();
        System.out.println("enter 2");
        r = input.nextInt();

    }
}
