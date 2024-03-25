/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40, 50, 60, 70, 80, 90};
        int key = 40;
        int low = 0;
        int high = sortedArray.length - 1;

        int index = runBinarySearchIteratively(sortedArray, key, low, high);

        if (index != Integer.MAX_VALUE) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

// Time comlplexity O(logn),and space complexity is O(1).


