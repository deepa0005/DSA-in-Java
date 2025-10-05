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

//Kadanes algo 
public static void kadanes(int num[]){
    int cs= 0;
    int ms = Integer.MIN_VALUE;

    for(int i=0; i<num.length; i++){
        cs = cs + num[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println("our max subarray is :" + ms);
}


//TRapped Rain Water
public static int trappedRainWater(int height[]){
    int n = height.length;
    //left max boundary
    int Leftmax [] = new int [n]; 
Leftmax[0] = height[0];
for(int i =1; i<n; i++ ){
    Leftmax[i] = Math.max(height[i], Leftmax[i-1]);
}
    //right max boundary
int rightMax[] = new int[n];
 rightMax[n-1] = height[n-1] ;
 for(int i = n-2; i>=0; i--){
    rightMax[i]=Math.max(height[i], rightMax[i+1]);
 }
 
 //loop
 int trappedWater = 0;
 for(int i=0; i<n; i++){
    int WaterLevel = Math.min(Leftmax[i], rightMax[i]);
    trappedWater += WaterLevel - height[i];
 }
 
 return trappedWater;
 //water level = min(leftmax , rightMax)
//  TrappedWater = water level - hieght[i]
}


//buy sell stock
public static int buySellStock(int prices[]){
int buyPrice = Integer.MAX_VALUE;
int MaxProfit = 0;

for(int i = 0; i<prices.length; i++){
    if(buyPrice<prices[i]){
      int  profit = prices[i]-buyPrice; //todays profit
      MaxProfit = Math.max(MaxProfit, profit); //global profit
    }
    else{
        buyPrice = prices[i];

    }
}
return MaxProfit;
}

public static int repeatedArray(int nums []){

    for(int i = 0; i<nums.length; i++){
        for(int j = i+1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                return 1;
            }
            
        }
    }
    return 0;
}
public static void main(String args[]) {
    // int prices[] = { 7, 1, 5, 3, 6, 4};
    // System.out.println(buySellStock(prices));
    int nums[] = {1, 2, 3, 1};
    System.out.println(repeatedArray(nums));
    }
}
