import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[4];
        String line;
        while ((line = br.readLine()) != null) {
            for (char c : line.toCharArray()) {
                if (c >=97 && c<=122) {
                    arr[0]++;
                } else if (c >=65 && c <=90) {
                    arr[1]++;
                } else if (c >= 48 && c <=57) {
                    arr[2]++;
                } else if (c==32) {
                    arr[3]++;
                }
            }
            sb.append(arr[0]).append(" ").append(arr[1]).append(" ").append(arr[2]).append(" ").append(arr[3])
                .append("\n");
            arr[0] = 0;
            arr[1] = 0;
            arr[2] = 0;
            arr[3] = 0;
        }
            
        System.out.print(sb);
        br.close();
    }
}