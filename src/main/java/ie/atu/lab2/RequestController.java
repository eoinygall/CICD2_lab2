package ie.atu.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "name: " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, int age ) {
        return "Name: " + name + " Age: " + age;
    }
}
