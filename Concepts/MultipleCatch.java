package Concepts;

public class MultipleCatch {
    public static void main(String args[]) {

        try {
            int[] numbers = {1, 2, 3};

            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            String text = null;

            System.out.println(text.length()); // This will throw NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }
}
