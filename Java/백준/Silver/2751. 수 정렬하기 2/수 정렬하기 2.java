import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}