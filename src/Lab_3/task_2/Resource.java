package Lab_3.task_2;

import java.util.Objects;
import java.io.IOException;
import java.io.Closeable;

public class Resource implements AutoCloseable {

    private String file;

    public Resource(final String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(final String file) {
        this.file = file;
    }

    //////////////////////////////////////////////////////////////////

    @Override
    public void close(){
        System.out.println("This resource closed!!!");
    }

    public void read() throws IOException{
        throw new IOException();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Resource resource = (Resource) o;

        return Objects.equals(file, resource.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        return "File: " + file;
    }
}
