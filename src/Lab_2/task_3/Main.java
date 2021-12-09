package Lab_2.task_3;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(final String[] args) {

        final List<Subject> listOfSubjects = new ArrayList<>();
        final Subject chemistry = new Subject("Chemistry");
        final Subject history = new Subject("History");
        listOfSubjects.add(chemistry);
        listOfSubjects.add(history);

        final Student student = new Student("Yuliia", "Osadchuk", 2 ,15461827,"IT", listOfSubjects, random(listOfSubjects));
        System.out.println(student);

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