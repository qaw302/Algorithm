import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        int[] alphabet = new int[26];
        for (char c : br.readLine().toCharArray()) {
            alphabet[c-'a']++;
        }

        for (int i=0; i<26; i++) {
            sb.append(alphabet[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}