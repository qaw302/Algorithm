import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String AB = st.nextToken() + st.nextToken();
        String CD = st.nextToken() + st.nextToken();

        System.out.println(Long.parseLong(AB) + Long.parseLong(CD));
        
        br.close();
    }
}