package Lab_3.task_3;
import Lab_2.task_3.Student;


import java.util.Objects;

public class StudentSimple {
    private String name;
    private String surname;
    private String speciality;
    private int id;

    public StudentSimple(final String name, final String surname, final String speciality, final int id) {
        this.name = name;
        this.speciality = speciality;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String specialty) {
        this.speciality = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final StudentSimple that = (StudentSimple) o;

        return id == that.id && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, speciality, id);
    }

    @Override
    public String toString() {
        return "----------------------Student----------------------" + '\n' +
                "Name: " + getName() + '\n' +
                "Surname: " + getSurname() + '\n' +
                "Speciality: " + getSpeciality() + '\n' +
                "Id: " + getId() + '\n' +
                "----------------------------------------------------" + '\n' +
                '\n';
    }

}