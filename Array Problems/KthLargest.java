
/*
Given an array of integers nums and an integer k, return the k-th largest element in the array. 
 */

import java.util.Collections;
import java.util.PriorityQueue ; 

public class KthLargest {
    public static void main(String[] args){

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2; // second largest

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()) ; 

        // adding the elements from array into the maxheap

        for(int element: nums){
            maxHeap.add(element) ; 
        }

        System.out.println("Printing the elements of maxHeap by polling: ");

        PriorityQueue<Integer> maxHeapCopy = new PriorityQueue<>(maxHeap) ; 

        while(!maxHeapCopy.isEmpty()){
            System.out.print(maxHeapCopy.poll() + " ");
        }
        System.out.println();

        // extracting the element 

        for(int i=0 ; i < k-1 ; i++){
            maxHeap.poll() ; // removing the largest element 
        }

        // the root of the heap is now the k-th largest element 

        int kthlargestelement = maxHeap.peek() ; 

        System.out.println("Kth largest element: " + kthlargestelement);

    }
}
