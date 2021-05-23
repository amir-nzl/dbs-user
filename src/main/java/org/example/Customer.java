package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends BaseModel{
    @Id
    long id;

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
