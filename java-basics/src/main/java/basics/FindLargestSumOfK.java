package basics;

public class FindLargestSumOfK {
    public static int solve(int[] numbers, int k) {
        int maxSum = 0;

        for(int i=0; i<k; i++) {
            maxSum += numbers[i];
        }

        // Sliding Window 
        int currentSum = maxSum;
        for(int i=k; i<numbers.length; i++){
            currentSum -= numbers[i-k] - numbers[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, -1};
        System.out.println(solve(numbers, 2));
        System.out.println(solve(numbers, 3));
    }
}
