public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        int result1 = c.square(c.add(c.multiply(3,4), c.multiply(5,7)));
        int result2 = c.square(c.add(4,7)) + c.square(c.add(8,3));

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}