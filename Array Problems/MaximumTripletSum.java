
/*
Problem Title: Maximum Triplet Sum in an Array

Given an array of integers, find the three elements whose sum is the maximum among all possible triplets in the array.
 */

import java.util.Arrays ; 

public class MaximumTripletSum{
    public static void main(String[] args){

        int[] arr = {1, 10, 5, 6, 2} ; 

        if(arr.length < 3){
            System.out.println("Array must have atleast 3 elements");
            return ; 
        }

        Arrays.sort(arr) ; // sorting the array in increasing order 

        int n = arr.length ; 

        int maxSum = arr[n-1] + arr[n-2] + arr[n-3] ; 

        System.out.println("Maximum sum: " + maxSum);

    }
}