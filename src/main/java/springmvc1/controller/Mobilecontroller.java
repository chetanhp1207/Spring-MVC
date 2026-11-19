package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc1.entity.Mobiledetails;

@Controller
public class Mobilecontroller {

    
    @GetMapping("/getmobileform")
    @ResponseBody
    public String getForm() {

        return "<form action='mobiledetails' method='post'>"

                + "<fieldset>"
                + "<legend>Mobile Details</legend>"

                + "<label for='id'>ID:</label>"
                + "<input type='number' id='id' name='id' required>"
                + "<br><br>"

                + "<label for='name'>Name:</label>"
                + "<input type='text' id='name' name='name' required>"
                + "<br><br>"

                + "<label for='model'>Model:</label>"
                + "<input type='text' id='model' name='model' required>"
                + "<br><br>"

                + "<label for='color'>Color:</label>"
                + "<input type='text' id='color' name='color' required>"
                + "<br><br>"

                + "<label for='price'>Price:</label>"
                + "<input type='number' id='price' name='price' step='0.01'>"
                + "<br><br>"

                + "<label for='processor'>Processor:</label>"
                + "<input type='text' id='processor' name='processor'>"
                + "<br><br>"

                + "<label for='ram'>RAM:</label>"
                + "<input type='number' id='ram' name='ram'>"
                + "<br><br>"

                + "<label for='rom'>ROM:</label>"
                + "<input type='number' id='rom' name='rom'>"
                + "<br><br>"

                + "<input type='submit' value='Submit'>"
                + "<input type='reset' value='Clear'>"

                + "</fieldset>"
                + "</form>";
    }

    
    @PostMapping("/mobiledetails")
    @ResponseBody
    public String getDetails(@ModelAttribute Mobiledetails mobile) {

        return "<table border='2' cellspacing='10' cellpadding='10'>"

                + "<tr>"
                + "<th>ID</th>"
                + "<th>Name</th>"
                + "<th>Model</th>"
                + "<th>Color</th>"
                + "<th>Price</th>"
                + "<th>Processor</th>"
                + "<th>RAM</th>"
                + "<th>ROM</th>"
                + "</tr>"

                + "<tr>"
                + "<td>" + mobile.getId() + "</td>"
                + "<td>" + mobile.getName() + "</td>"
                + "<td>" + mobile.getModel() + "</td>"
                + "<td>" + mobile.getColor() + "</td>"
                + "<td>" + mobile.getPrice() + "</td>"
                + "<td>" + mobile.getProcessor() + "</td>"
                + "<td>" + mobile.getRam() + "</td>"
                + "<td>" + mobile.getRom() + "</td>"
                + "</tr>"

                + "</table>";
    }
}