package dto;

import entities.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Casper Kruse Olesen
 */
public class PersonsDTO {
    
    List<PersonDTO> all = new ArrayList();
    
    public PersonsDTO(List<Person> personEntities) {
         personEntities.forEach((p) -> {
            all.add(new PersonDTO(p));
        });
    }

    public List<PersonDTO> getAll() {
        return all;
    }
    
}
