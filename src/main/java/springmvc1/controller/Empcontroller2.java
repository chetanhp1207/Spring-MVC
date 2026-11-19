
package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Empcontroller2 {
	
    @GetMapping("/fetching2/{name}/{id}/{password}/{mobile}")
    @ResponseBody
    public String getEmployee(
            @PathVariable("name") String empname,
            @PathVariable("id") Integer id,
            @PathVariable("password") String password,
            @PathVariable("mobile") Long mobile) {

        return "<table border='1' cellpadding='10' style='border:4px solid hotpink;'>"
                + "<tr><th>Employee Details</th><th>Value</th></tr>"
                + "<tr><td>Name</td><td>" + empname + "</td></tr>"
                + "<tr><td>Empid</td><td>" + id + "</td></tr>"
                + "<tr><td>Password</td><td>" + password + "</td></tr>"
                + "<tr><td>Mobile</td><td>" + mobile + "</td></tr>"
                + "</table>";
    }
}
