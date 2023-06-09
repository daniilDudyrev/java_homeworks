package homework5.homework5_3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String personId;
    private String name;
    private String city;
    private List<Fine> fines;

    public Person(String personId, String name, String city) {
        this.personId = personId;
        this.name = name;
        this.city = city;
        this.fines = new ArrayList<>();
    }


    public void addFine(Fine fine) {
        fines.add(fine);
    }

    public void removeFine(Fine fine) {
        fines.remove(fine);
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Fine> getFines() {
        return fines;
    }
}
