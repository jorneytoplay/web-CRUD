package memedlyaev.service;


import memedlyaev.Entity.Person;
import memedlyaev.Entity.CustomizedPersonCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class PersonService {

    @Autowired
    private CustomizedPersonCrudRepository personCrudRepository;

    @Transactional
    public Person getById(Long id) {
        return personCrudRepository.getById(id);
    }
    @Transactional
    public List<Person> getAll(){
        return personCrudRepository.findAll();
    }
    @Transactional
    public void save(Person person){personCrudRepository.save(person);}

    //@Transactional
    //@Modifying
    //@Query("delete from Person where id = ?1")
    //public void delete(Long id){personCrudRepository.delete(id);}

    @Transactional
    public void delete(Long id){personCrudRepository.deleteById(id);}
}
