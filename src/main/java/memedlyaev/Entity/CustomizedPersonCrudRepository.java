package memedlyaev.Entity;


import memedlyaev.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomizedPersonCrudRepository extends JpaRepository<Person,Long> {
    Person getById(long id);


}
