import org.example.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.ebean.DB;

class SimpleJUnitTest {

    @Test
    public void insertFindDelete() {

        User User = new User();
        User.setName("Jon Snow");

        // insert the customer in the DB
        DB.save(User);

        // Find by Id
        User foundJonSnow = DB.find(User.class, 1);
        Assertions.assertEquals(foundJonSnow.getName(), "Jon Snow");

        // delete the customer
        DB.delete(User);
    }
}