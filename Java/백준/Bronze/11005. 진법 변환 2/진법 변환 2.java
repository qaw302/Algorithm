import java.io.*;
import java.util.*;

class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        transfer(N, B);
        System.out.println(sb);
    }

    public static void transfer(int N, int B) {
        if (N == 0) {return ;}
        int remainder = N%B;
        if(remainder <10) {
            sb.insert(0, remainder);
        } else {
            sb.insert(0, (char)(remainder+55));
        }
        transfer(N/B, B);
    }
}