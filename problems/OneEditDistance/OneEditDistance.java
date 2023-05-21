import java.io.File;
import java.util.Scanner;

public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.length() == t.length()) // s has the same length as t, so the only possibility is replacing one char in s and t
                    return s.substring(i + 1).equals(t.substring(i + 1));
                else if (s.length() < t.length()) // t is longer than s, so the only possibility is deleting one char from t
                    return s.substring(i).equals(t.substring(i + 1));
                else // s is longer than t, so the only possibility is deleting one char from s
                    return t.substring(i).equals(s.substring(i + 1));
            }
        }
        //All previous chars are the same, the only possibility is deleting the end char in the longer one of s and t
        return Math.abs(s.length() - t.length()) == 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("in.txt"));
        Scanner out = new Scanner(new File("out.txt"));
        int n = Integer.parseInt(in.nextLine());
        for(int it = 0; it < n; it++){
            String[] inStrings = in.nextLine().split(" ");
            boolean userOutput = isOneEditDistance(inStrings[0], inStrings[1]);
            boolean expectedOutput = out.nextInt() == 1;
            if(userOutput == expectedOutput){
                System.out.println("TestCase: " + it + " Passed");
            } else{
                System.err.println("TestCase: " + it + " Failed: Incorrect Output");
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("User Output: " + userOutput);
            }
        }
    }
}
