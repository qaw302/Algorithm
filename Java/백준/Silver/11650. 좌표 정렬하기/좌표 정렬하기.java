import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] positions = new int[n][2];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            positions[i][0] = Integer.parseInt(st.nextToken());
            positions[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(positions, (a, b)-> {
           if (a[0] == b[0]) {
               return a[1] - b[1];
           } else {
               return a[0] - b[0];
           }
        });

        StringBuilder sb = new StringBuilder();
        for (int[] pos : positions) {
            sb.append(pos[0]);
            sb.append(" ");
            sb.append(pos[1]);
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}