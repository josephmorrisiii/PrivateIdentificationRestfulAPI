package firstProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@RestController
@RequestMapping("/api")

public class JosephMorrisController {

        private static final Logger LOGGER = LoggerFactory.getLogger(JosephMorrisController.class);

        private final JosephMorrisRepository repository;

    public JosephMorrisController(final JosephMorrisRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value="/facts",method = RequestMethod.GET)
            public JosephMorrisServiceResponse facts() {

        LOGGER.info("Request received for [/facts]");
        final JosephMorrisServiceResponse response = new JosephMorrisServiceResponse();
        response.setType("Success");
        final List<JosephMorrisFacts> facts = StreamSupport.stream(repository.findAll().spliterator(),false).collect(Collectors.toList());
        response.setValue(facts);
        return response;
    }



    public class JosephMorrisServiceResponse{
        private String type;

        private List<JosephMorrisFacts> value;

        public String getType() {
            return type;
        }

        public List<JosephMorrisFacts> getValue() {
            return value;
        }

        public void setType(final String type) {
            this.type = type;
        }

        public void setValue(final List<JosephMorrisFacts> value) {
            this.value = value;
        }
    }

    
}
