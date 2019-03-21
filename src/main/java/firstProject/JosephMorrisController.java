package firstProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")

public class JosephMorrisController {

        private static final Logger LOGGER = LoggerFactory.getLogger(JosephMorrisController.class);

        private final JosephMorrisRepository repository;

    public JosephMorrisController(final JosephMorrisRepository repository){
        this.repository = repository;
    }


    
}
