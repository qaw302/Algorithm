import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> deque = new LinkedList<>();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            
            if ("push_front".equals(method)) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
                
            } else if ("push_back".equals(method)) {
                deque.addLast(Integer.parseInt(st.nextToken()));
                
            } else if ("pop_front".equals(method)) {
                sb.append(deque.isEmpty()? -1 : deque.removeFirst());
                sb.append("\n");
                
            } else if ("pop_back".equals(method)) {
                sb.append(deque.isEmpty()? -1 : deque.removeLast());
                sb.append("\n");
                
            } else if ("size".equals(method)) {
                sb.append(deque.size());
                sb.append("\n");
                
            } else if ("empty".equals(method)) {
                sb.append(deque.isEmpty()? 1 : 0);
                sb.append("\n");
                
            } else if ("front".equals(method)) {
                sb.append(deque.isEmpty()? -1 : deque.getFirst());
                sb.append("\n");
                
            } else if ("back".equals(method)) {
                sb.append(deque.isEmpty()? -1 : deque.getLast());
                sb.append("\n");                
            }            
        }

        System.out.print(sb);
        
        br.close();
    }
}