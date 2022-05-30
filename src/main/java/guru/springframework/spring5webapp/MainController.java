package guru.springframework.spring5webapp;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/api/person")
    public Person insertPerson(@RequestBody Person person){
        System.out.println("Person method invoked.");
        return person;
    }
}
