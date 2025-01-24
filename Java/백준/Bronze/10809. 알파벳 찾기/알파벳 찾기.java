import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String word = br.readLine();
        Arrays.fill(arr, -1);
        for (int i=0; i<word.length(); i++) {
            if (arr[word.charAt(i)-'a'] == -1) {
                arr[word.charAt(i)-'a'] = i;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}