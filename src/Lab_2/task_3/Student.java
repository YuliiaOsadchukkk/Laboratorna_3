package Lab_2.task_3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


public class Student {

    private String name;
    private String surname;
    private int course;
    private String specialty;
    private int id;
    private List<Subject> subjects;
    private List<Mark> marks;


    public Student (final String name,final String surname,final int course,final int id, final String specialty, List<Subject> subjects, List<Mark> marks){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.specialty = specialty;
        this.id = id;
        this.subjects = subjects;
        this.marks = marks;
    }

    public Student (final String name,final String surname,final int course,final int id, final String specialty, List<Subject> subjects){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.specialty = specialty;
        this.id = id;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(final String specialty) {
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(final List<Mark> marks) {
        this.marks = marks;
    }

    /////////////////////////

    public void map(final Subject subject) {
        final Map<Integer, Mark> studentMap = new TreeMap<>();

        final int i = this.getSubjects().indexOf(subject);
        studentMap.put(this.getId(), this.getMarks().get(i));

        System.out.println(studentMap);
    }

    public void addSubject(final Subject subject) {
        this.getSubjects().add(subject);

    }

    public void addMark() {
        final int m = ((int) (Math.random() * (5 - 1) + 1));
        final Mark mark = new Mark(m);

        this.getMarks().add(mark);
    }

    public void printMarks() {
        System.out.println(this.getMarks());
    }

    ////////////////////////


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Student student = (Student) o;

            return getCourse() == student.getCourse() && getId() == student.getId() && getName() == student.getName()
                    && getSurname() == student.getSurname() && getSpecialty() == student.getSpecialty()
                    && Objects.equals(getSubjects(), student.getSubjects()) && Objects.equals(getMarks(), student.getMarks());
        }
    }

    @Override
    public int hashCode() {
        return
                17 * this.getName().hashCode() +
                        17 * this.getSurname().hashCode()  +
                        17 * this.getCourse()+
                        17 * this.getSpecialty().hashCode() +
                        17 * this.getId();
    }

    @Override
    public String toString() {
        return "----------------------Student----------------------" + '\n' +
                "Name: " + getName() + '\n' +
                "Surname: " + getSurname() + '\n' +
                "Course: " + getCourse() + '\n' +
                "Id: " + getId() + '\n' +
                "Specialty: " + getSpecialty() + '\n' +
                "Subjects: " + getSubjects().toString() + '\n' +
                "Marks accordingly: " +getMarks().toString() + '\n' +
                "----------------------------------------------------" + '\n' +
                '\n';
    }

}