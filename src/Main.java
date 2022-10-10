public class Main {
    public static final int MAX = 10;
    public static final int MIN = 1;

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (MAX - MIN)) + MIN;
        System.out.println("Your lucky number " + randomNumber);

    }
}
