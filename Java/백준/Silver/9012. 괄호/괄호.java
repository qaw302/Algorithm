import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        LinkedList<String> list = new LinkedList();
        for (int i=0; i<T; i++) {
            for(String s: br.readLine().split("")) {
                
                if ("(".equals(s)) {
                    list.add(s);
                    
                } else if (")".equals(s)) {
                    if (list.isEmpty()) {
                        list.add("-1");
                    } else if (!"-1".equals(list.getLast())) {
                        list.removeLast();
                    } else {
                        break;
                    }
                }
            }
            sb.append(list.isEmpty()? "YES":"NO");
            
            sb.append("\n");
            list.clear();
        }

        System.out.println(sb.toString());
        br.close();
    }
}