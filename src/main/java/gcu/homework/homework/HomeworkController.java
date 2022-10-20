package gcu.homework.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeworkController {
    private Homework homework;

    @GetMapping("/")
    public String welcome()   {
        return "Welcome!";
    }

    @GetMapping("/hello")
    public String hello()   {
        return "Hello!";
    }

    @RequestMapping("/selfIntroductions")
    String selfIntroductions(@RequestParam("name") String name,
               @RequestParam("age") int age) {
        return String.valueOf(homework.selfIntroductions(name, age));
    }

    @RequestMapping("/contact")
    String phone(@RequestParam("phone") String phone) {
        return String.valueOf(homework.contact(phone));
    }

}

