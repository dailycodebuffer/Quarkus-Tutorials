package org.dailycodebuffer;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.panache.common.Parameters;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Person extends PanacheEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static List<Person> getPersonByFirstName(String firstName)
    {
        return Person.find("firstName",firstName).list();
    }


    public static List<Person> getPersonByFirstNameandLastName(String firstName,String lastName)
    {
        return Person.find("firstName = :fn and lastName = : ln", Parameters.with("fn",firstName)
        .and("ln",lastName).map()
        ).list();
    }

}
