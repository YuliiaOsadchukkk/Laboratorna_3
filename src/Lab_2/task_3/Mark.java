package Lab_2.task_3;

public class Mark {
    private int mark;


    public Mark(final int mark){
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        if(mark >= 1 && mark <=5)
            this.mark = mark;
        else
            System.out.println("Invalid mark");
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Mark m = (Mark) o;
            return getMark() == m.getMark();
        }
    }

    @Override
    public int hashCode() {
        return 17 * this.getMark();
    }

    @Override
    public String toString() {
        return "" + getMark();
    }
}
