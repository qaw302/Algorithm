import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int result = 0;

        Deque<String> stack = new LinkedList<>();

        for (int i=0; i<str.length; i++) {
            if ("(".equals(str[i])) {
                stack.add(str[i]);
                
            } else {
                if ("(".equals(str[i-1])){
                    result += stack.size()-1;
                    
                } else {
                    result += 1;
                }

                stack.pop();
            }
        }
        
        System.out.println(result);
        br.close();
    }
}
