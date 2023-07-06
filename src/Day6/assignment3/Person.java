package Day6.assignment3;

import java.time.LocalDate;
//Now consider Person class with first name, last name, birth date, emails, mobile numbers. 
//Person objects with same first name, last name and birth date are same person. 
//Person can have multiple emails and mobile numbers.
import java.util.*;

public class Person {
	String firstName;
	String lastName;
	LocalDate birthDate;
	Set<String> email;
	Set<String> phone;

	public Person(String firstName, String lastName, LocalDate birthDate) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.birthDate = birthDate;
	    this.email = new HashSet<>();
	    this.phone = new HashSet<>();
	}

    @Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		if ( this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName)
				&& this.birthDate.equals(p.birthDate)) {
			return true;
		}
		return false;

	}
    @Override
    public int hashCode() {
    	return (firstName.hashCode()+lastName.hashCode()+birthDate.hashCode())/13;
    	
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

	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(String email) {
        this.email.add(email);
    }

    public void setPhone(String phone) {
        this.phone.add(phone);
    }
	

	public Set<String> getPhone() {
		return phone;
	}
	
	public String toString() {
		return firstName+" "+lastName+" "+birthDate+" "+email+" "+ phone;
	}


}
