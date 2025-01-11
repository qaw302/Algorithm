import java.util.*;
import java.io.*;

public class Main {
    public static LinkedList<Integer> stack = new LinkedList<>();
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            
            if ("push".equals(method)) {
                stack.add(Integer.parseInt(st.nextToken()));
                
            } else if ("pop".equals(method)) {
                sb.append(stack.isEmpty()? -1:stack.removeLast());
                sb.append("\n");
                
            } else if ("size".equals(method)) {
                sb.append(stack.size());
                sb.append("\n");
                
            } else if ("empty".equals(method)) {
                sb.append(stack.isEmpty()?1:0);
                sb.append("\n");
                
            } else if ("top".equals(method)) {
                sb.append(stack.isEmpty()? -1:stack.getLast());
                sb.append("\n");
            }
            
        }

        System.out.println(sb.toString());
        br.close();
    }

}
