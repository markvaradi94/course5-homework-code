package ro.fasttrackit;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Course 5 Homework");
        int[] array = {1, 2, 3, 4, 5};
        int[] result = numbersGreaterThan(array, 1);
        System.out.println(Arrays.toString(result));
        System.out.println("==================================");
        limitedDonations(10000, 10);
        System.out.println("==================================");
        printSentences("Alex are mere de haur; Paula are afine, Andrei are morcovi.");
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    // exercise 3
    public static int[] numbersGreaterThan(int[] array, int min) {
        int count = 0;
        for (int number : array) {
            if (number > min) {
                count++;
            }
        }

        System.out.println("Numbers greater than " + min + ": " + count);
        int[] result = new int[count];
        count = 0;

        for (int number : array) {
            if (number > min) {
                result[count] = number;
                count++;
            }
        }

        return result;
    }

    // exercise 5
    public static void limitedDonations(int target, int limit) {
        int sum = 0;
        int count = 0;
        Random random = new Random();

        while (sum < target && count < limit) {
            int donation = random.nextInt(50, 1000);
            System.out.println("Donation: " + donation);
            sum += donation;
            count++;
        }

        if (sum < target) {
            System.out.println("Did not reach target of: " + target + ", collected: " + sum);
        } else {
            System.out.println("You collected " + sum);
        }
    }

    // exercise 6
    public static void printSentences(String phrase) {
        String[] tokens = phrase.split("\\.");
        String[] tokens2 = phrase.split("[.,;]");
        for (String sentence : tokens2) {
            System.out.println(sentence.trim());
        }
    }
}