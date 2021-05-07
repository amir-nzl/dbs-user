import org.example.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.ebean.DB;

class SimpleJUnitTest {

    @Test
    public void insertFindDelete() {

        Customer User = new Customer();
        User.setName("Jon Snow");

        // insert the customer in the DB
        DB.save(User);

        // Find by Id
        Customer foundJonSnow = DB.find(Customer.class, 1);
        System.out.println(foundJonSnow.getName());
        Assertions.assertEquals(foundJonSnow.getName(), "Jon Snow");

        // delete the customer
       // DB.delete(User);
    }
}