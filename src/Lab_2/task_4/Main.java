package Lab_2.task_4;

import Lab_2.task_3.*;

import java.util.ArrayList;
import java.util.List;

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



        System.out.println(listOfStudents);
        System.out.println();
        System.out.println();


        final Subject ukrainian = new Subject("Ukrainian");
        listOfStudents.get(0).addSubject(ukrainian);
        for(final Student student : listOfStudents){student.addMark();}


        System.out.println(listOfStudents);
        System.out.println();
        System.out.println();


        final ListOfStudents s = new ListOfStudents(listOfStudents);
        s.theBestStudent();


        studentA.map(physics);
        studentB.map(physics);
        studentC.map(physics);
        studentD.map(physics);
    }

    public static List<Mark> random(final List<Subject> listOfSubjects){
        final List<Mark> listOfMarks = new ArrayList<>();

        for (int i = 0; i < listOfSubjects.size(); i++) {

            final int num = (int) (Math.random() * (5 - 1) + 1);
            final Mark mark = new Mark(num);
            listOfMarks.add(mark);

        }
        return listOfMarks;
    }
}