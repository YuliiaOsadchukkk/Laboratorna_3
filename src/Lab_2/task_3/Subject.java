package Lab_2.task_3;


public class Subject {

    private String subject;

    public Subject(final String subject){
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = this.subject;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Subject s = (Subject) o;
            return subject == s.subject ;
        }
    }

    @Override
    public int hashCode() {
        return 17 * this.getSubject().hashCode() ;
    }

    @Override
    public String toString() {
        return   " " + getSubject() ;
    }
}

