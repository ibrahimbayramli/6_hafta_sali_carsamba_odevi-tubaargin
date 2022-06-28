package array;

import java.util.*;

public class ArrayExample {
    private static int[] randomArray(int count) {
        Random random = new Random();
        int originalArray[] = new int[count];
        for (int i = 0; i < originalArray.length; i++) {
            int randomNumber = random.nextInt(10) + 1;
            originalArray[i] = randomNumber;
        }
        System.out.print("Random Array: ");
        for (int temp : originalArray) {
            System.out.print(temp + " ");
        }
        return originalArray;
    }

    private static void cloneArray(int[] originalArray) {
        int clone[] = originalArray.clone();
        System.out.print("\nClone Array: ");
        for (int temp : clone) {
            System.out.print(temp + " ");
        }
        Arrays.sort(clone);
        System.out.print("\nSorted Array: ");
        for (int temp : clone) {
            System.out.print(temp + " ");
        }
        System.out.println("\nMinimum number:" + clone[0]);
        int maxValue = clone[clone.length - 1];
        System.out.println("Maximum number:" + maxValue);
        if (clone[clone.length - 1] > 25) {
            System.out.println("Maximum number=" + maxValue + " is greater than 25");
        } else {
            System.out.println(maxValue + " is less than 25");
        }
        int search = Arrays.binarySearch(clone, 5);
        if (search >= 0) {
            System.out.println("The number 5 is in the " + search + ". index of the array!");
        } else {
            System.out.println("The number 5 is not in this array!");
        }
    }

    private static void arrayManager(int[] array) {
        int evenArray[] = new int[array.length];
        int oddArray[] = new int[array.length];
        int total = 0, oddCount = 0, evenCount = 0, oddTotal = 0, evenTotal = 0, evenIndex = 0, oddIndex = 0;
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
            if (array[i] % 2 == 0) {
                evenArray[evenIndex] = array[i];
                evenTotal += array[i];
                evenIndex++;
                evenCount++;
            } else {
                oddArray[oddIndex] = array[i];
                oddTotal += array[i];
                oddIndex++;
                oddCount++;
            }
        }
        average = total / array.length;
        System.out.println("Total of numbers:" + total);
        System.out.println("Average of numbers:" + average);
        System.out.print("Even Array: ");
        for (int temp : evenArray) {
            if (temp != 0)
                System.out.print(temp + " ");
        }
        System.out.println("\nCount of even numbers:" + evenCount);
        System.out.println("Sum of even numbers:" + evenTotal);

        System.out.print("Odd Array: ");
        for (int temp : oddArray) {
            if (temp != 0)
                System.out.print(temp + " ");
        }
        System.out.println("\nCount of odd numbers:" + oddCount);
        System.out.println("Sum of odd numbers:" + oddTotal);
    }

    private static void duplicateNumber(int[] originalArray) {
        int duplicateArray[] = new int[originalArray.length];
        int index = 0;

        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    duplicateArray[index] = originalArray[j];
                    index++;
                }
            }
        }
        System.out.print("Duplicate array numbers: ");
        if (index == 0)
            System.out.print("No duplicate number");
        else {
            removeDuplicateElements(duplicateArray);

        }
    }

    public static void removeDuplicateElements(int[] originalArray) {
        Arrays.sort(originalArray);
        int index = 0;
        originalArray[index] = originalArray[0];
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[index] != originalArray[i]) {
                index++;
                originalArray[index] = originalArray[i];
            }
        }
        for (int i = 0; i <= index; i++) {
            if (originalArray[i] != 0) {
                System.out.print(originalArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter count:");
        int count = scan.nextInt();
        int temp[] = randomArray(count);
        cloneArray(temp);
        arrayManager(temp);
        duplicateNumber(temp);
        System.out.print("\nAfter removing duplicates: ");
        removeDuplicateElements(temp);
    }
}



