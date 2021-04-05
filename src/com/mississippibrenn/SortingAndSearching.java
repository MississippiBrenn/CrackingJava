package com.mississippibrenn;

public class SortingAndSearching {

    boolean binarySearch(int[] arr, int low, int high, int searchr){

        while( low < high){
            int midpoint = low + high /2;

            if(searchr > arr[midpoint]){
                binarySearch(arr, midpoint+1, high, searchr);

            }else if (searchr < arr[midpoint]){
                binarySearch(arr, 0, midpoint, searchr);
            }else{
                return true;
            }

        }

        return false;

    }

    // Bubble Sort Runtime O(n^2) average and worst case Memory O(1)

    // Selection Sort Runtime O(n^2) average and worst case Memory O(1)

    // Merge Sort Runtime O(n log(n)) average and worst case Memory Depends

    void mergeSort(int[] array){
        int midPoint = (array.length/2);
        int high = (array.length);
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, high);


    }

    void mergeSort(int[] array, int[] helper, int low, int high){
        // middle becomes either high or low


        if( low < high){
            int midPoint = low+high /2;
            // left sub array
            mergeSort(array, helper, low, midPoint );
            //right sub array
            mergeSort(array, helper, midPoint+1, high);
            merge(array, helper, low, midPoint, high);
        }
    }

    void merge(int[] array, int[] helper, int low, int midPoint, int high){
     for(int i = low; i <= high; i++){
         helper[i] = array[i];
     }

     int helperLeft = low;
     int helperRight = midPoint + 1;
     int current = low;

     // iterate through helper array  and compare left and right half
        // copying back with smaller element from two halves into original array

    while(helperLeft <= midPoint && helperRight <= high){
        if(helper[helperLeft] <= helper[helperRight]){
            array[current] = helper[helperLeft];
            helperLeft++;
        } else {
            // if right element is smaller than left element
            array[current] = helper[helperRight];
            helperRight++;
        }
        current++;
    }
    //copy the rest of the left side of the array into the target array
        int remaining = midPoint - helperLeft;
        for(int i = 0; i <= remaining; i++ ){
            array[current + 1] = helper[helperLeft + i];
        }
    }

}
