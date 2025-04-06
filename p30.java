import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();

        
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

      
        int enrollmentNo = 103;
        if (students.containsKey(enrollmentNo)) {
            System.out.println("Student with enrollment number " + enrollmentNo + " is: " + students.get(enrollmentNo));
        } else {
            System.out.println("Student not found with enrollment number " + enrollmentNo);
        }
    }
}
