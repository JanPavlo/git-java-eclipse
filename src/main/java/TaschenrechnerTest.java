public class TaschenrechnerTest {

    public static void main(String[] args) {
        Taschenrechner calculator = new Taschenrechner();

        // Test addition
        System.out.println("Addition Test: 5 + 3 = " + calculator.add(5, 3));

        // Test subtraction
        System.out.println("Subtraction Test: 10 - 4 = " + calculator.subtract(10, 4));

        // Test multiplication
        System.out.println("Multiplication Test: 6 * 7 = " + calculator.multiply(6, 7));

        // Test division
        System.out.println("Division Test: 20 / 5 = " + calculator.divide(20, 5));

        // Test division by zero exception
        try {
            System.out.println("Division by zero test: " + calculator.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("All tests completed!");
    }
}