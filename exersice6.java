public class exersice6 {
    public static void main(String[] args) {
        // Find maximum from the an array
        int number[] = { 1, 2, 3, 4, 5 };
        int max = number[0];
        for (int i = 0; i <= number.length; ++i) {
            if (number[i] > max)
                max = number[i];
        }
        System.out.println(max);
    }
}