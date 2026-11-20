package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Coursecontroller {

    @GetMapping("/getindex")
    public String getBlood(Model model) {

        model.addAttribute("name1", "Dinakar D B");
        model.addAttribute("id1", 1);
        model.addAttribute("course1", "Web Technologies");
        model.addAttribute("skills1", "HTML,CSS,JavaScript");
        model.addAttribute("amount1", 1000);
        model.addAttribute("organisation1", "JSP");
        model.addAttribute("status1", "Ongoing");
        model.addAttribute("grade1", "A");

        model.addAttribute("name2", "Sharath Kumar");
        model.addAttribute("id2", 2);
        model.addAttribute("course2", "Java Full Stack");
        model.addAttribute("skills2", "Java,Spring,SQL");
        model.addAttribute("amount2", 1500);
        model.addAttribute("organisation2", "JSP");
        model.addAttribute("status2", "Completed");
        model.addAttribute("grade2", "A+");

        model.addAttribute("name3", "Chidu Shetty");
        model.addAttribute("id3", 3);
        model.addAttribute("course3", "Python");
        model.addAttribute("skills3", "Python,Django,MySQL");
        model.addAttribute("amount3", 1200);
        model.addAttribute("organisation3", "JSP");
        model.addAttribute("status3", "Ongoing");
        model.addAttribute("grade3", "B+");

        model.addAttribute("name4", "Rajath Shetty");
        model.addAttribute("id4", 4);
        model.addAttribute("course4", "Web Development");
        model.addAttribute("skills4", "HTML,CSS,React");
        model.addAttribute("amount4", 2000);
        model.addAttribute("organisation4", "JSP");
        model.addAttribute("status4", "Completed");
        model.addAttribute("grade4", "A");

        model.addAttribute("name5", "Anirudh J");
        model.addAttribute("id5", 5);
        model.addAttribute("course5", "Java Programming");
        model.addAttribute("skills5", "Java,JDBC,Servlets");
        model.addAttribute("amount5", 1800);
        model.addAttribute("organisation5", "JSP");
        model.addAttribute("status5", "Ongoing");
        model.addAttribute("grade5", "A+");

        model.addAttribute("name6", "Kiran M");
        model.addAttribute("id6", 6);
        model.addAttribute("course6", "Database");
        model.addAttribute("skills6", "SQL,MySQL,Oracle");
        model.addAttribute("amount6", 1000);
        model.addAttribute("organisation6", "JSP");
        model.addAttribute("status6", "Completed");
        model.addAttribute("grade6", "B");

        model.addAttribute("name7", "Subramanya P");
        model.addAttribute("id7", 7);
        model.addAttribute("course7", "Frontend Development");
        model.addAttribute("skills7", "HTML,CSS,JavaScript");
        model.addAttribute("amount7", 1500);
        model.addAttribute("organisation7", "JSP");
        model.addAttribute("status7", "Ongoing");
        model.addAttribute("grade7", "A");

        model.addAttribute("name8", "Chetan P");
        model.addAttribute("id8", 8);
        model.addAttribute("course8", "Backend Development");
        model.addAttribute("skills8", "Java,Spring Boot");
        model.addAttribute("amount8", 2500);
        model.addAttribute("organisation8", "JSP");
        model.addAttribute("status8", "Completed");
        model.addAttribute("grade8", "A+");

        model.addAttribute("name9", "Mithun Gowda");
        model.addAttribute("id9", 9);
        model.addAttribute("course9", "MERN Stack");
        model.addAttribute("skills9", "MongoDB,Express,React,Node");
        model.addAttribute("amount9", 3000);
        model.addAttribute("organisation9", "JSP");
        model.addAttribute("status9", "Ongoing");
        model.addAttribute("grade9", "A");

        model.addAttribute("name10", "Manoj R");
        model.addAttribute("id10", 10);
        model.addAttribute("course10", "Full Stack");
        model.addAttribute("skills10", "Java,React,MySQL");
        model.addAttribute("amount10", 2000);
        model.addAttribute("organisation10", "JSP");
        model.addAttribute("status10", "Completed");
        model.addAttribute("grade10", "B+");

        return "index";
    }
}