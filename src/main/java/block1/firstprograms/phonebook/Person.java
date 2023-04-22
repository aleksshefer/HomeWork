package block1.firstprograms.phonebook;

public class Person {
    private final String name;
    private final String phone;
    private final String email;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "\nName: " + this.getName() + "\nPhone number: " + this.getPhone() + "\nEmail: " +
                this.getEmail();
    }
}