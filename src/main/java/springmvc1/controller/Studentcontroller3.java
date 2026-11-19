package springmvc1.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Studentcontroller3 {
	
		@GetMapping("/student1")
		@ResponseBody
		public String getStudent() {

		    String name = "Chetan";
		    String email = "chetanhp@gmail.com";
		    String pwd = "Chetan@1207";
		    String address = "Kumta";
		    String gender = "male";
		    long number = 911382988;

		    return 
		            "<h2>Student Details</h2>" +

		            "<table border='1' cellpadding='10'>" +

		            "<tr>" +
		            "<th>Name</th>" +
		            "<th>Email</th>" +
		            "<th>Password</th>" +
		            "<th>Address</th>" +
		            "<th>Gender</th>" +
		            "<th>Number</th>" +
		            "</tr>" +

		            "<tr>" +
		            "<td>" + name + "</td>" +
		            "<td>" + email + "</td>" +
		            "<td>" + pwd + "</td>" +
		            "<td>" + address + "</td>" +
		            "<td>" + gender + "</td>" +
		            "<td>" + number + "</td>" +
		            "</tr>" +

		            "</table>" ;
		            
		}

}
