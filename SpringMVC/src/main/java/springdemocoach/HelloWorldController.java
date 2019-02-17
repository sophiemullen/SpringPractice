package springdemocoach;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String nameToCaps(HttpServletRequest request, Model model) {

        String greeting = "Hey " + request.getParameter("studentName").toUpperCase();

        model.addAttribute("message", greeting);

        return "helloworld";
    }
}
