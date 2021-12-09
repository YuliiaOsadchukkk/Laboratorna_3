package Lab_2.task_4;
import Lab_2.task_3.*;

import java.util.ArrayList;
import java.util.List;


public class ListOfStudents {

    private List<Student> listOfStudents;

    public ListOfStudents(final List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(final List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }


    public void theBestStudent() {
        double average = 0.0;
        double m = 0.0;
        final ArrayList<Double> arrayAverage = new ArrayList<Double>(getListOfStudents().size());


        for (final Student student : getListOfStudents()) {

            for (final Mark mark : student.getMarks()) {
                m = m + mark.getMark();
            }
            m = m / (student.getMarks().size());
            arrayAverage.add(m);


            if (m > average) {
                average = m;
            }
        }

        System.out.println(getListOfStudents().get(arrayAverage.indexOf(average)));
    }
}
