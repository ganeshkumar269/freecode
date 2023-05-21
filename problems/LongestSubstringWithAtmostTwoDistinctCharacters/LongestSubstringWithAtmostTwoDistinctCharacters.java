import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.stream.IntStream;

public class LongestSubstringWithAtmostTwoDistinctCharacters {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chs = s.toCharArray();
        int n = s.length();

        HashMap<Character, Integer> count = new HashMap<>();

        int longest = 0;

        int firstIdx = 0;

        for (int i = 0; i < n; i++) {
            count.put(chs[i], count.getOrDefault(chs[i], 0) + 1);
            while (count.size() > 2) {
                count.put(chs[firstIdx], count.get(chs[firstIdx]) - 1);
                if (count.get(chs[firstIdx]) == 0) {
                    count.remove(chs[firstIdx]);
                }
                firstIdx++;
            }
            longest = Math.max(longest, i - firstIdx + 1);
        }
        return longest;
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
