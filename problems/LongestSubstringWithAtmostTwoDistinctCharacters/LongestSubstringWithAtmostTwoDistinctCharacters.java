import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.stream.IntStream;

public class LongestSubstringWithAtmostTwoDistinctCharacters {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        // write your code here
        return 0;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("./in.txt"));
        Scanner out = new Scanner(new File("./out.txt"));
        int n = Integer.parseInt(in.nextLine());
        for(int it = 0; it < n; it++){
            String str = in.nextLine();
            int userOutput = lengthOfLongestSubstringTwoDistinct(str);
            int expectedOutput = out.nextInt();
            if(userOutput == expectedOutput){
                System.out.println("TestCase: " + it + " Passed");
            } else{
                System.err.println("TestCase: " + it + " Failed: Incorrect Output");
                if(str.length() > 100){
                    System.out.println("Input: " + str.substring(0, 100) + "...");
                }else{
                    System.out.println("Input: " + str);
                }
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("User Output: " + userOutput);
            }

        }
    }

}
