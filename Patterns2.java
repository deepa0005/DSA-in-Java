import java.util.*;

public class Patterns2 {

    public static void hollowRectangle(int totRows, int totCols) {
        // for rows
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    //inverted half pyramid 
    public static void invertdHalfPyramid(int n ){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }


    //num trangle

    public static void numTriangle(int n ){
        for (int i=1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    public static void floyds_Triangle(int n ){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int totRows= sc.nextInt();
        // int totCols = sc.nextInt();
        int n = sc.nextInt();
        // hollowRectangle(totRows, totCols);
        // invertdHalfPyramid(n);
        // numTriangle(n);
        floyds_Triangle(n);
    }
}
