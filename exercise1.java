public class exercise1 {
    public static void main(String[] args) {
        // Sum of numbers 1 to 100 and their Average using for loop
        int sum = 0;
        for (int i = 1; i < 101; ++i) {
            sum += i;
        }
        float average = sum / 100;
        System.out.println("The sum of 1 to 100 = " + sum);
        System.out.println("average = " + average);

    }
}