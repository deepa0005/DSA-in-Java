import java.util.*;

public class Sorting {
    // bubble sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     swap++;
                }
               
            }
    System.out.println("Swaps in pass " + (turn+1) + " = " + swap);

    if (swap == 0) break;
        }

    }

    //desc order bubble sort 
    public static void descBubble(int arr[]){
        for(int turn =0 ; turn<arr.length-1; turn++){

            int swap = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                     swap++;
                }
            }
            System.out.println("swaps in pass"+ (turn+1)+ " "+ swap);
        }
    }
    //selection sort
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }



    //insertion sort
public static void insertionSort(int arr[]){
    for(int i=0; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        //finding place to insert element
        while(prev>=0 && arr[prev]<curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1] = curr;
    }
}

public static void countingSort(int arr[]){
    //1find the largest 
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        largest = Math.max(largest, arr[i]);
    }

    //create count array 
    int count[] = new int[largest+1];
    for(int i =0; i<arr.length; i++){
        count[arr[i]]++;
    }

    //sorting
    int j=0;
    for(int i=0; i<count.length; i++){
        while(count[i]<0){
            arr[j] =i;
            j++;
            count[i]++;
        
        }
    }
}

public static void descountingSort(int arr[]){
    //1find the largest 
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        largest = Math.max(largest, arr[i]);
    }

    //create count array 
    int count[] = new int[largest+1];
    for(int i =0; i<arr.length; i++){
        count[arr[i]]++;
    }

    //sorting
   int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {   // 🔽 loop from high to low
        while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
        }
}
}

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1};
        //  int arr[] = {1, 2, 3, 4, 5};

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr, 0,  3);
        // descBubble(arr);
        // countingSort(arr);
        descountingSort(arr);
        printarr(arr);
    }

}
