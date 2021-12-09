package Lab_3.task_4;


public class SimpleCalculations {



    public static void addition(final double number1, final double number2){
        System.out.println("Start addition: " + number1 + " + " + number2);
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }

        System.out.println("---Addition finished: " + (number1 + number2));
    }



    public static void substraction(final double number1, final double number2){
        System.out.println("Start subtraction: " + number1 + " - " + number2);
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }

        System.out.println("---Subtraction finished: " + (number1 - number2));
    }



    public static void multiplication(final double number1, final double number2){
        System.out.println("Start multiplication: " + number1 + " * " + number2);
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }

        System.out.println("---Multiplication finished: " + (number1 * number2));
    }



    public static void division(final double number1, final double number2){
        System.out.println("Start division: " + number1 + " / " + number2);
        try {
            Thread.sleep(1000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }

        System.out.println("---Division finished: " + (number1 / number2));
    }


}
