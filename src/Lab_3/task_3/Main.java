package Lab_3.task_3;

import Lab_2.task_3.Mark;
import Lab_2.task_3.Student;
import Lab_2.task_3.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {


        final List<Subject> listOfSubjects = new ArrayList<>();

        final Subject physics = new Subject("Physics");
        final Subject mathematics = new Subject("Mathematics");
        final Subject english = new Subject("English");

        listOfSubjects.add(physics);
        listOfSubjects.add(mathematics);
        listOfSubjects.add(english);


        final List<Student> listOfStudents = new ArrayList<>();
        final Student studentA = new Student("Natalya", "Andriichuk",3,11569554, "IT", listOfSubjects, random(listOfSubjects));
        final Student studentB = new Student("Tanya", "Matushak", 1,22254632, "IT", listOfSubjects, random(listOfSubjects));
        final Student studentC = new Student("Ilona", "Prokopyk",2 , 13845129, "FL", listOfSubjects, random(listOfSubjects));
        final Student studentD = new Student("Roman", "Baziyk", 1,23120207, "CS", listOfSubjects, random(listOfSubjects));
        listOfStudents.add(studentA);
        listOfStudents.add(studentB);
        listOfStudents.add(studentC);
        listOfStudents.add(studentD);

        System.out.println();
        System.out.println();
        System.out.println("*********************************************** Simple list of students ***********************************************");

        System.out.println(listOfStudents);
        System.out.println();

        System.out.println("*********************************** Transfer (List<Student>) in List<StudentSimple> ***********************************");
        System.out.println(transfering(listOfStudents));
        System.out.println();


        System.out.println("********************************* Delete all students with average mark less than 3: **********************************");
        System.out.println(deleteLessThanThree(listOfStudents));
        System.out.println();

        System.out.println("************************************************* All English marks: **************************************************");
        System.out.println(printEnglishMarks(listOfStudents, english));
        System.out.println();

        System.out.println("****************************************** Sort students by name and surname *******************************************");
        System.out.println(sortingStudents(listOfStudents));
        System.out.println();

        System.out.println("************************************************ Find the best student: *************************************************");
        System.out.println(findTheBestStudent(listOfStudents));
        System.out.println();


        System.out.println("******************************************* Students' surnames with defis:: *********************************************");
        System.out.println(surnameWithDefis(listOfStudents));
        System.out.println();
    }


    public static List<Mark> random(final List<Subject> subjectList) {
        return subjectList.stream()
                .map(subject -> new Mark((int) (Math.random() * (5 - 1) + 1)))
                .collect(Collectors.toList());
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static List<StudentSimple> transfering(final List<Student> studentList) {
        return studentList.stream()
                .map(student -> new StudentSimple(student.getName(), student.getSurname(), student.getSpecialty(), student.getId()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteLessThanThree(final List<Student> studentList) {
        return studentList.stream()
                .filter(student -> (student.getMarks().stream()
                        .mapToInt(Mark::getMark)).average().orElse(0) >= 3)
                .collect(Collectors.toList());
    }

    public static List<Mark> printEnglishMarks(final List<Student> studentList, final Subject subject) {
        return studentList.stream()
                .map(student -> student.getMarks().get((student.getSubjects().stream()
                        .map(Subject::getSubject)
                        .collect(Collectors.toList()).indexOf(subject.getSubject()))))
                .collect(Collectors.toList());
    }

    public static List<Student> sortingStudents(final List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSurname))
                .collect(Collectors.toList());
    }

    public static Student findTheBestStudent(final List<Student> studentList) {
        return studentList.stream()
                .max(Comparator.comparingDouble(student -> student.getMarks().stream()
                        .mapToInt(Mark::getMark).average().getAsDouble())).get();
    }

    public static List<String> surnameWithDefis(final List<Student> studentList) {
        return studentList.stream()
                .map(Student::getSurname)
                .reduce((n, m) -> n + "-" + m)
                .stream().toList();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}