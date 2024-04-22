
public class Main {

    //using the runnable interface, create a thread that prints even numbers between 1 and 250 and give the sum of the even numbers
    Runnable evenNumbers = new Runnable() {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 2; i <= 250; i += 2) {
                sum += i;
                System.out.println(i);
            }
            System.out.println(" The number "+ sum +  " is the sum of all even numbers between 1 and 250");
        }
    };
    //main method
    public static void main(String[] args) {

        Main main = new Main();
        Thread thread = new Thread(main.evenNumbers);
        thread.start();
    }
}