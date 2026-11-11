import java.util.ArrayList;
import java.util.List;

public class bakrkenzy {
    private static Student student = new Student("KENZY Bakr ",20,"bakrkenzy");

   public static Student getStudent(){
       return student;
   }


    public static void main(String[] args) {
        System.out.println(student);

        System.out.println("\n\tOur students in cass:\n");
        List<Student> students = new ArrayList<>();
        students.add(bakrkenzy.getStudent());
       // Due to me not being on class I do not have other students info.
        // Feel free to send me a couple if you want and I can resubmit the file if you need me to. Thank you.


        for (Student s : students) {
            System.out.printf("%d. %s\n", students.indexOf(s)+1, s);
        }
    }
}
