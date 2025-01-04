import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(
                st.nextToken(),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(students);

        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.name).append('\n');
        }

        System.out.print(sb);
        br.close();
    }
}

class Student implements Comparable<Student> {
    public final String name;
    public final int korean;
    public final int english;
    public final int math;
    
    public Student (String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        
        if (o == this) {return 0;}
        else if (korean == o.korean) {
            
            if (english == o.english) {
                
                if (math == o.math) {
                    
                    return name.compareTo(o.name);
                    
                } else {
                    
                    return o.math - math;
                }
                
            } else {
                
                return english - o.english;
            }
            
        } else {
            
            return o.korean - korean;
        }
    }
}