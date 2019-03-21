package firstProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
public class JosephMorrisRepository {

    private List<JosephMorrisFacts> facts = new ArrayList<>();



    public JosephMorrisRepository(){
        facts.add(createFact("Joseph Morris","Undisclosed", "Black",60000));
    }



    public JosephMorrisFacts createFact(final String name, final String currentEmployer, final String race, final int age){
        final JosephMorrisFacts josephMorrisFacts = new JosephMorrisFacts();
        josephMorrisFacts.setName(name);
        josephMorrisFacts.setCurrentEmployer(currentEmployer);
        josephMorrisFacts.setRace(race);
        josephMorrisFacts.setAge(age);

        return josephMorrisFacts;
    }

    public Iterable<JosephMorrisFacts> findAll() {
        return Collections.unmodifiableList(facts);
    }

}
