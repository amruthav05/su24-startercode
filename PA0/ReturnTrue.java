/**
 * This class contains a method to determine if the given integer plus 4
 * is greater than 10.
 */
public class ReturnTrue {

    /**
     * Checks if the given integer plus 4 is greater than 10.
     *
     * @param i the integer to be checked
     * @return true if i + 4 is greater than 10, otherwise false
     */
    public static boolean returnTrue(int i) {
        int s = 10;
        while (i < s) {
            if (i + 4 > s) {
                return true;
            }
            i += 1;
        }
        return false;
    }

    // No need to touch main!
    public static void main(String[] args) {
        System.out.println(returnTrue(1));
        System.out.println(returnTrue(5));
    }
}
