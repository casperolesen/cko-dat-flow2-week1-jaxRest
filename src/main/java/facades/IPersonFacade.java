package facades;

import dto.PersonDTO;
import entities.Person;
import java.util.List;

/**
 *
 * @author Casper Kruse Olesen
 */
public interface IPersonFacade {
    
    public Person addPerson(String fName, String lName, String phone);
    public Person deletePerson(int id);
    public PersonDTO getPerson(int id);
    public List<PersonDTO> getAllPersons();
    public Person editPerson(Person p);
}
