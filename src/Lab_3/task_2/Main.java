package Lab_3.task_2;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) {


        try(final Resource file = new Resource("nameOfFile.txt")){
            System.out.println(file);
            file.read();
        }catch (IOException e){
            System.err.println("IOException!!! (Can't read the file)");
        }


    }
}
