package Day6.assignment4;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<String> emails;
    private Set<String> phoneNumbers;

    public Person(String firstName, String lastName, LocalDate birthDate, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.emails = new HashSet<>();
        this.phoneNumbers = new HashSet<>();
        addEmail(email);
        addPhoneNumber(phoneNumber);
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }

    @Override
    public int compareTo(Person other) {
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        } else {
            return this.lastName.compareTo(other.lastName);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + birthDate + " " + emails + " " + phoneNumbers;
    }
}

