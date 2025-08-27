import java.util.*;

public class patterns {
    // public static void main(String[] args) {

    // //Star Pattern
    // /* for (int line = 1; line <= 4; line++) {
    // for (int star = 1; star <= line; star++) {
    // System.out.print(" * ");
    // }
    // System.out.println(" ");
    // }
    // System.out.println("Star Pattern "); */

    // // int n = 4;
    // // for(int line=1; line<=n; line++){
    // // for(int star=1; star<=n-line+1; star++){
    // // System.out.print(" * ");
    // // }
    // // System.out.println(" ");
    // // }
    // // System.out.println(" Inverted Star Pattern ");

    // // int n = 4;
    // // for(int i = 1; i<=n; i++){
    // // for(int num = 1; num<=i; num++){
    // // System.out.print(num);
    // // }
    // // System.out.println();
    // // }

    // // char ch = 'A';
    // // for(int i = 1; i<=4; i++){
    // // for (int j = 1; j<=i ; j++){
    // // System.out.print(ch);
    // // ch++;
    // // }
    // // System.out.println();
    // // }

    // // int num = 1;
    // // for(int i =1; i<=8; i++){
    // // for(int j=1; j<=i; j++){
    // // System.out.print(" "+num);
    // // num++;
    // // }
    // // System.out.println();
    // // }

    // }

    public static int multiply(int a, int b) {

        int product = a * b;
        return product;

    }

    public static int fact(int n ){
          int f = 1;
        for(int i = 1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }

    public static int binCoeff(int n , int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void primeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }   



    public static void biniToDec(int bin ){
       int pow = 0;
       int dec = 0; 
         while(bin>0){
          int lastDigit = bin % 10;
          dec = dec + (lastDigit * (int)Math.pow(2, pow));
          pow++;
          bin = bin / 10;
         }
            System.out.println("Decimal of given binary is " + dec);
    }

public static void decToBini(int dec){  
    int pow = 0;
    int bin = 0;    
    while(dec>0){
        int rem = dec % 2;
        bin = bin + (rem * (int)Math.pow(10, pow));
        pow++;
        dec = dec / 2;
    }
    System.out.println("Binary of given decimal is " + bin);
}


public static int avgofThree(int a, int b, int c){
    int avg = (a + b + c) /3;
    return avg;
}


public static boolean isEven(int n ){
    if(n%2 ==0){
        return true;
    }else{
        return false;
    }

}

public static boolean palindrome(int n){
int rev = 0 ;
int num = n;
while(n >0 ){
    int lastDigit = n % 10;
    rev = rev * 10 + lastDigit;
    n = n / 10;
}

return num == rev ;  
}
    public static void main(String[] args) {
        // int n = 6;
      
    //     int a = 10;
    //     int b = 20;
    //    int prod = multiply(a, b);
    //     System.out.println(prod);

    // System.out.println( "Factorial of n num " + fact(n, f));

//   primeInRange(20);
    // biniToDec(101);
    System.out.println(palindrome(29422));


    }

}
