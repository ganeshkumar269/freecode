import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // write your code here
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("./in.txt"));
        Scanner out = new Scanner(new File("./out.txt"));
        int n = in.nextInt();
        for(int it = 0; it < n; it++){
            int sz = in.nextInt();
            int[] input = IntStream.range(0, sz).map(it1 -> in.nextInt()).toArray();
            List<List<Integer>> userOutput = threeSum(input);
            int outSize = out.nextInt();
            List<List<Integer>> expectedOutput = IntStream.range(0, outSize).mapToObj(it1 -> Arrays.asList(out.nextInt(),out.nextInt(),out.nextInt())).collect(Collectors.toList());
            if(userOutput.equals(expectedOutput)){
                System.out.println("TestCase: " + it + " Passed");
            } else{
                System.err.println("TestCase: " + it + " Failed: Incorrect Output");
                String hasMoreInput = input.length > 100 ? "..." : "";
                System.out.println("Input: " + Arrays.stream(input).limit(100) + hasMoreInput);
                String hasMoreExpOutput = expectedOutput.size() > 100 ? "..." : "";
                String hasMoreOutput = userOutput.size() > 100 ? "..." : "";
                System.out.println("Expected Output: " + expectedOutput.stream().limit(100) + hasMoreExpOutput);
                System.out.println("User Output: " + userOutput.stream().limit(100) + hasMoreOutput);
            }
        }
    }
}
