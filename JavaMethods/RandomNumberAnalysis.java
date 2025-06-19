import java.util.Arrays;
import java.util.Random;

public class RandomNumberAnalysis {

    public int[] generate4DigitRandomArray(int size) {
        if (size <= 0) {
            return new int[0];
        }
        int[] randomNumbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + random.nextInt(9000); // Generates a number between 1000 and 9999
        }
        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[0]; // Or throw an IllegalArgumentException
        }

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = sum / numbers.length;
        return new double[]{average, (double)min, (double)max};
    }

    public static void main(String[] args) {
        RandomNumberAnalysis analysis = new RandomNumberAnalysis();
        int arraySize = 5;

        int[] randomNumbers = analysis.generate4DigitRandomArray(arraySize);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        if (randomNumbers.length > 0) {
            double[] results = analysis.findAverageMinMax(randomNumbers);
            System.out.printf("Average: %.2f\n", results[0]);
            System.out.printf("Minimum: %.0f\n", results[1]);
            System.out.printf("Maximum: %.0f\n", results[2]);
        } else {
            System.out.println("No numbers were generated to analyze.");
        }
    }
}