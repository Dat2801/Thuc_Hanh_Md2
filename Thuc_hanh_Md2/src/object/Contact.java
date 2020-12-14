package object;

public class Contact {
    private String date;
    private String email;
    private Person person;

    public Contact() {

    }
    public Contact(String date, String email, Person person) {

        this.date = date;
        this.email = email;
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", person=" + person +
                '}';
    }
}

