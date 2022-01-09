package memedlyaev.Entity;


import memedlyaev.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomizedPersonCrudRepository extends JpaRepository<Person,Long> {
    Person getById(long id);


    @Modifying(clearAutomatically = true)
    //@Query("update Person feedEntry set feedEntry.read =:isRead where .id =:entryId")
    @Query("update Person u set u.user_name = ?1 where u.id = ?2")
    void updateName(String user_name, long id);

    @Modifying(clearAutomatically = true)
    @Query("update Person u set u.status = ?1 where u.id = ?2")
    void updateStatus(String user_name, long id);
}

