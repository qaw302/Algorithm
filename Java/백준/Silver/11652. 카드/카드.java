import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long result = 0;
        int maxCnt = 0;
        Map<Long, Integer> cards = new HashMap<>();
        for (int i=0; i<N; i++) {
            long n = Long.parseLong(br.readLine());
            int value = cards.getOrDefault(n, 0) + 1;
            if (value > maxCnt) {
                result = n;
                maxCnt = value;
            } else if (value == maxCnt) {
                if (n < result) {
                    result = n;
                }
            }
            
            cards.put(n, value);
        }

        System.out.println(result);
        br.close();
    }
}