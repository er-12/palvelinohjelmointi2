package s22.viikko2osa2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.viikko2osa2.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("hello")
	public String listStudents(Model model) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		
		model.addAttribute("studentList", students);
		
		return "students";
	}

}
