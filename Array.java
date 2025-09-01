public class Array {

    public static int linearSearch(int num[], int key) {
        for (int i = 1; i <= num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static int largestinNum(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    // binary search

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }


    //reverse an array 
    public static void reverseArray(int num[]){
        int start = 0;
        int end = num.length-1;

        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
       
    }


    //pairs in array
public static void pairs(int num[]){
    int tp = 0 ;
    for(int i=0; i<num.length; i++){
        int curr = num[i];
        for(int j = i+1; j<num.length; j++){
            System.out.print("(" + curr + ","+ num[j] + ")" );
            tp++;
        }
        System.out.println();
    }
    System.out.println("total no of pairs " +tp);
}


//sub arrays using nested loops
public static void subArray(int num[]){
    int ts = 0;
    for(int i=0; i<num.length; i++){

        for(int j=i; j<num.length; j++){
            
            for(int k = i; k <=j; k++){
             System.out.print(num[k]+ " ");
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total no of subarrays " + ts);
}
    public static void main(String args[]) {
        int num[] = { 2, 3, 4, 5, 6 };
        // int key = 4;
        // int index = linearSearch(num, key);
        // if(index==-1){
        // System.out.println("not found");
        // }else{
        // System.out.println("key is in idx" + index);
        // }

        // System.out.println("largest of num is " + largestinNum(num));
        // System.out.println("the key is found in " + binarySearch(num, key));


        // //print
        // reverseArray(num);
        // for(int i=0; i<num.length; i++){
        //     System.out.print(num[i] + " ");
        // }
        //   System.out.println();

        // pairs(num);

        subArray(num);
    }
}
