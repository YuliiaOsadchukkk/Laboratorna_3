package Lab_3.task_4;

public class Main {
    public static void main(final String[] args) {

        final Thread T1 = new Thread(new Runnable1());
        final Thread T2 = new Thread(new Runnable2());
        final Thread T3 = new Thread(new Runnable3());
        final Thread T4 = new Thread(new Runnable4());

        T1.start();
        T2.start();
        T3.start();
        T4.start();


    }


    public static class Runnable1 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.addition(1.5, 8.5);
        }
    }

    public static class Runnable2 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.substraction(7.3, 5.1);
        }
    }

    public static class Runnable3 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.multiplication(2.4, 2.0);
        }
    }

    public static class Runnable4 implements Runnable {
        @Override
        public void run() {
            SimpleCalculations.division(9.0, 3.0);
        }
    }


}
