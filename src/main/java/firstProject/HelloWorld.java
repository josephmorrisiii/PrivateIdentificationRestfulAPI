package firstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String helloWorld(){
        return "Hello world";
    }
}
