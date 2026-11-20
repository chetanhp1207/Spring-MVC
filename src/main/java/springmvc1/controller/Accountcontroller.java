
package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc1.entity.Accountdetails;

@Controller
public class Accountcontroller {

    
    @GetMapping("/getform")
    @ResponseBody
    public String getForm() {

        return "<form action='details' method='post'>"

                + "<fieldset>"
                + "<legend>Bank Account Details</legend>"

                + "<label for='accno'>Account Number:</label>"
                + "<input type='number' id='accno' name='accno' required>"
                + "<br><br>"

                + "<label for='name'>Name:</label>"
                + "<input type='text' id='name' name='name' required>"
                + "<br><br>"

                + "<label for='type'>Account Type:</label>"
                + "<select id='type' name='type'>"
                + "<option>Savings</option>"
                + "<option>Current</option>"
                + "</select>"
                + "<br><br>"

                + "<label for='branch'>Branch:</label>"
                + "<input type='text' id='branch' name='branch' required>"
                + "<br><br>"

                + "<label for='bal'>Balance:</label>"
                + "<input type='number' id='bal' name='bal' step='0.01'>"
                + "<br><br>"

                + "<label for='dep'>Deposit Amount:</label>"
                + "<input type='number' id='dep' name='dep' step='0.01'>"
                + "<br><br>"

                + "<label for='tid'>Transaction ID:</label>"
                + "<input type='number' id='tid' name='tid'>"
                + "<br><br>"

                + "<input type='submit' value='Submit'>"
                + "<input type='reset' value='Clear'>"

                + "</fieldset>"
                + "</form>";
    }

    
    @PostMapping("/details")
    @ResponseBody
    public String getDetails(@ModelAttribute Accountdetails account) {

        return "<table border='2' cellspacing='10' cellpadding='10'>"

                + "<tr>"
                + "<th>Accno</th>"
                + "<th>Name</th>"
                + "<th>Type</th>"
                + "<th>Branch</th>"
                + "<th>Bal</th>"
                + "<th>Dep</th>"
                + "<th>Tid</th>"
                + "</tr>"

                + "<tr>"
                + "<td>" + account.getAccno() + "</td>"
                + "<td>" + account.getName() + "</td>"
                + "<td>" + account.getType() + "</td>"
                + "<td>" + account.getBranch() + "</td>"
                + "<td>" + account.getBal() + "</td>"
                + "<td>" + account.getDep() + "</td>"
                + "<td>" + account.getTid() + "</td>"
                + "</tr>"

                + "</table>";
    }
}
