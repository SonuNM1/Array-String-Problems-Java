
// Kth-smallest element in the array 

import java.util.PriorityQueue; 

public class KthSmallest{
    public static void main(String args[]){

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2; // second smallest

        // creating a min heap 

        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ; 

        // adding the elements of array to the minHeap

        for(int element: nums){
            minHeap.add(element) ; 
        }

        System.out.println("Printing the elements of min heap");

        PriorityQueue<Integer> minHeapCopy = new PriorityQueue<>(minHeap) ; 

        while(!minHeapCopy.isEmpty()){
            System.out.print(minHeapCopy.poll() + " ");
        }

        for(int i=0 ; i < k-1 ; i++){ // 0
            minHeap.poll() ; 
        }   

        int kthSmallestElement = minHeap.peek() ; 

        System.out.println();
        System.out.println("Kth smallest element in the array: " + kthSmallestElement);

    }
}