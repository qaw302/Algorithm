import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            
            if ("push".equals(method)) {
                queue.add(Integer.parseInt(st.nextToken()));
                
            } else if ("pop".equals(method)) {
                sb.append(queue.isEmpty()?-1:queue.removeFirst());
                sb.append("\n");
                
            } else if ("size".equals(method)) {
                sb.append(queue.size());
                sb.append("\n");
                
            } else if ("empty".equals(method)) {
                sb.append(queue.isEmpty()?1:0);
                sb.append("\n");
                
            } else if ("front".equals(method)) {
                sb.append(queue.isEmpty()?-1:queue.getFirst());
                sb.append("\n");
                
            } else if ("back".equals(method)) {
                sb.append(queue.isEmpty()?-1:queue.getLast());
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}