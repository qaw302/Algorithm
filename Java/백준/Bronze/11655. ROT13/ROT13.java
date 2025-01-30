import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c+=13;
                if (c > 90) {
                    c -= 26;
                }
            } else if (c >= 97 && c <= 122) {
                c += 13;
                if (c > 122) {
                    c -= 26;
                }
            }
            sb.append(c);
        }
        
        System.out.println(sb);
    }
}