package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@RequestMapping(value="/fetch" ,method=RequestMethod.GET)
	@ResponseBody
	public String getStudent() {
		return "Student data ";
	}
	@RequestMapping(value="/insert" ,method = RequestMethod.POST)
	@ResponseBody
	public String insertStudent() {
		return "Student data inserted succesfull";
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseBody
	public String updateStudent() {
		return "student updated successfully";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent() {
		return "student data deleted successfully";
	}
}
