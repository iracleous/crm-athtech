package gr.athtech.crm.repository;

import gr.athtech.crm.exception.PersonException;
import gr.athtech.crm.model.Address;
import gr.athtech.crm.model.Person;

public interface PersonRepository {
    //CRUD
    int create(Person person);
    Person read(int id) throws PersonException;
    void update(int id, Address newAddress) throws PersonException;
    void delete(int id) throws PersonException;
}
