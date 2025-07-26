import model.Student;
import service.StudentService;
import com.school.student.*;
public class main {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Alice";
		s.age = 21;
		
		StudentService ss = new StudentService();
		ss.printStudent(s);

		Student1 s1 = new Student1();
		s1.display("Naveen");
	}

}
