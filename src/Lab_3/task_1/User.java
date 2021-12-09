package Lab_3.task_1;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;


public class User {
    private Address address = new Address();
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String email;
    private String password;


    public User(final String country, final String region, final String city, final String street, final int houseNumber, final String name, final String surname, final int age, final String phoneNumber, final String email, final String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.address.setCountry(country);
        this.address.setRegion(region);
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setHouseNumber(houseNumber);
        /*
        this.address.getCountry();
        this.address.getRegion();
        this.address.getCity();
        this.address.getStreet();
        this.address.getHouseNumber();
        */

        validate();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
        validate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        validate();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        validate();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        validate();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        validate();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        validate();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        validate();
    }


    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;

        return age == user.age && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(address, user.address) && Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, surname, age, phoneNumber, email, password);
    }

    @Override
    public String toString() {
        return "User: " + getName() + " " + getSurname() + '\n' +
                "Age: " + getAge() + '\n' +
                getAddress().toString() + '\n' +
                "Phone Number: " + getPhoneNumber() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Password: " + getPassword();
    }





    public void validate() {
        final List<String> exceptionsMessages = new ArrayList<>();


        if (getAddress().getCountry().isEmpty() || getAddress().getCountry().contains(" ") || getAddress().getCountry().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Name of country can't be empty, contain spaces or numbers");
        }


        if (getAddress().getRegion().isEmpty() || getAddress().getRegion().contains(" ") || getAddress().getRegion().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Name of region can't be empty, contain spaces or numbers");
        }

        if (getAddress().getCity().isEmpty() || getAddress().getCity().contains(" ") || getAddress().getCity().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Name of city can't be empty, contain spaces or numbers");
        }

        if (getAddress().getStreet().isEmpty() || getAddress().getStreet().contains(" ") || getAddress().getStreet().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Name of street can't be empty, contain spaces or numbers");
        }

        if (getAddress().getHouseNumber() == 0) {
            exceptionsMessages.add("\n" + "Number of house can't be 0");
        }




        if (getName().isEmpty() || getName().contains(" ") || getName().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Name can't be empty, contain spaces or numbers");
        }

        if (getSurname().isEmpty() || getSurname().contains(" ") || getSurname().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("\n" + "Surname can't be empty, contain spaces or numbers");
        }

        if (getAge() < 18) {
            exceptionsMessages.add("\n" + "Only 18+ years old users can sign in");
        }

        if (getPhoneNumber().isEmpty() || !getPhoneNumber().matches("[0-9]{10}")) {
            exceptionsMessages.add("\n" + "PhoneNumber can't be empty, must contain only 10 numbers");
        }


        if (getEmail().isEmpty() || getEmail().contains(" ") || !getEmail().matches("[a-z0-9]{5,25}@lpnu.ua")) {
            exceptionsMessages.add("\n" + "Email can't be empty; can't be shorter than 5 characters, longer than 25 characters; can contain only low letters and numbers; must end with '@lpnu.ua'");
        }

        if (getPassword().isEmpty() || getPassword().contains(" ") || !getPassword().matches("[a-zA-Z0-9]{5,25}")) {
            exceptionsMessages.add("\n" + "Password can't be empty; can'tbe shorter than 5 characters, longer than 25 characters; can contain only low letters, high letters and numbers;");
        }




        if (!exceptionsMessages.isEmpty()) {
            throw new UncheckedException(exceptionsMessages, ErrorCode.ERROR_400);
        }
    }
}