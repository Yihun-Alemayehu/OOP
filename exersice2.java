public class exersice2 {
    public static void main(String[] args) {
        // Sum of numbers 1 to 100 and their Average using while loop
        int sum = 0, i = 1;
        while (i < 101) {
            sum += i;
            ++i;
        }
        float average = sum / 100;
        System.out.println("The sum of 1 to 100 = " + sum);
        System.out.println("Average = " + average);
    }
}