package gr.athtech.crm.repository;

import gr.athtech.crm.exception.PersonException;
import gr.athtech.crm.model.Address;
import gr.athtech.crm.model.Person;

import java.util.ArrayList;

public class PersonRepositoryImpl implements PersonRepository {

    private final ArrayList<Person> list;
    private int counter;

      public PersonRepositoryImpl(){
          list = new ArrayList<>();
      }


    @Override
    public int create(Person person) {
          counter++;
        person.setId(counter);
          list.add(person);
        return counter;
    }

    @Override
    public Person read(int id) throws PersonException {
          for(Person person : list){
              if (person.getId() == id){
                  return person ;
              }
          }
       throw new PersonException("The person has not been found");
    }

    @Override
    public void update(int id, Address newAddress) throws PersonException {
          Person person = read(id);
          if(newAddress == null) throw new PersonException("Cannot update. The address is null");
        person.setAddress(newAddress);

    }

    @Override
    public void delete(int id) throws PersonException {
        Person person = read(id);
        list.remove(person);
    }

    @Override
    public String toString() {
        return "PersonRepositoryImpl{" +
                "persons=" + list +
                ", counter=" + counter +
                '}';
    }
}
