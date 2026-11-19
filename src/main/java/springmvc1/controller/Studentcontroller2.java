package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Studentcontroller2 {
	@GetMapping(value="/student")
	@ResponseBody
	public String getStudent() {
		return "Student data ";
	}
	@PostMapping(value="/student")
	@ResponseBody
	public String insertStudent() {
		return "Student data inserted succesfull";
	}
	@PutMapping(value="/student")
	@ResponseBody
	public String updateStudent() {
		return "student updated successfully";
	}
	@PatchMapping(value="/student")
	@ResponseBody
	public String patchStudent(){
		return "value of student updated";
	}
	@DeleteMapping(value="/student")
	@ResponseBody
	public String deleteStudent() {
		return "student data deleted successfully";
	}
}
