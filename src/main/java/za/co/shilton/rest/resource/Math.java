package za.co.shilton.rest.resource;

/** A service used to provide mathematical functions
 * Created by shilton.naicker on 2015-01-10.
 */
public interface Math {

    /**
     * Add two numbers
     * @param num1 The first number
     * @param num2 The second number
     * @return The sum of the num1 and num2
     */
    String sum(String num1,String num2);
}
