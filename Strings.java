import java.util.*;

public class Strings {
//1 palindrome string
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Q2. Sortest path
    public static float sortestpath(String path) {
        int X = 0, Y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'E') {
                X++;
            } else if (dir == 'W') {
                X--;
            } else if (dir == 'S') {
                Y++;
            } else {
                Y--;
            }
        }
        int x2 = X * X;
        int y2 = Y * Y;
        return (float) Math.sqrt(x2 + y2);
    }

    //Q3 convert first letter of word to uppercase
    public static String toupperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    //Q4 string Compression 
     public static String compress(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;  // start counting the first character

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)); // append previous char
                sb.append(count);             // append count
                count = 1;                     // reset count for new char
            }
        }

        // append the last character and its count
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);

        // return compressed only if smaller, else original
        return sb.length() < str.length() ? sb.toString() : str;
    }



    public static void main(String args[]) {
        // String str = "racecar";
        // String str = "racecarrace";
        // String path = "WNEENSENNN";
        // String str = "hii i am deepa";
 String str = "aaabbccccd";



        // System.out.println(isPalindrome(str));
        // System.out.println(sortestpath(path));
        // System.out.println(toupperCase(str));
        System.out.println(compress(str));
    }
}
