import java.util.Arrays;

public class SecondThirdLargestSum {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSecondThirdLargestSum(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSecondThirdLargestSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n < 2) {
            System.out.println("Array must have at least 2 elements");
            return 0;
        }
        return arr[n - 2] + arr[n - 3];
    }
}
