import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        String[] posts = new String[str.length()];
        for (int i=0; i<str.length(); i++) {
            posts[i] = str.substring(i);
        }
        
        Arrays.sort(posts);
        
        for (String post: posts) {
            sb.append(post);
            sb.append("\n");
        }
        
        System.out.print(sb);
        br.close();
    }
}