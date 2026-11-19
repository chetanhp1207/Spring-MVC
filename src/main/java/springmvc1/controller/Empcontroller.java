package springmvc1.controller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Empcontroller {
	@GetMapping("/fetching")
	@ResponseBody
public String getEmployee(@RequestParam(value="name",required =false ) String empname,
		@RequestParam(value="id",required =false ) Integer empid,
		@RequestParam(value="password", required=false) String password,
		@RequestParam(value="mobno",required=false) Long mobno) {
//		if(empname==null&& empid==null) {
//			return "no name required and id required";
//		}
//		else if(empname==null&& empid!=null) {
//			return "no name required"+" empid: "+empid;
//		}
//		else if(empname!=null && empid==null) {
//			return "Employee name:"+empname +" emp id not required";
//		}
//		return "Name:"+empname+" empid: "+empid;
		if(empname==null)
			empname="";
		
		 String empid1 = Objects.toString(empid, "");
		if(password==null)
			password="";
			String mobnum=Objects.toString(mobno, "");
			
		
		return "<table border=2 cellspacing=5 cellpadding=5>"
				+ "<tr>"
				+ "<th>Empname"
				+ "</th>"
				+ "<th>Empid</th>"
				+ "<th>Password</th><th>Mobile Number</th></tr>"
				+ "<tr><td>"
				+ empname+"</td>"
						+ "<td>"+empid1+"</td>"
								+ "<td>"+password+"</td>"
										+ "<td>"+mobnum+"</td></tr>";
}
}
