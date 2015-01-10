package za.co.shilton.rest.resource;

import javax.ws.rs.*;

/** A resource class.
 * Created by shilton.naicker on 2015-01-10.
 */
@Path("/add")
public class MathImpl implements Math{


    /**
     * Add two numbers
     *
     * @param num1 The first number
     * @param num2 The second number
     * @return The sum of the num1 and num2
     * @throws java.lang.IllegalArgumentException num1 or num2 is null
     */
    @GET
    @Produces(value = "text/html")
    @Override
    public String sum(@QueryParam("num1")String num1, @QueryParam("num2")String num2) {
        if(num1 == null || num2 == null){

            throw new IllegalArgumentException("num1 or num2 is null");

        }
        else{
            return num1 + num2;

        }
    }
}
