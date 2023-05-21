import java.io.File;
import java.util.Scanner;

public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        // write your code here
        return false;
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
