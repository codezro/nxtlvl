package objects;

/**
 * Created by jpmc on 9/29/2016.
 */
public class Customer extends Person {

    String firstName = getFirstName();
    String lastName = getLastName();

    @Override
    public String introduceYourSelf(){
        return "Hi i'm a customer, my name is "+firstName+" "+lastName;
    }

    public String introduceYourSelf(String product){
        return "My name is "+firstName+" "+lastName+" and want to buy "+product;
    }

    public String introduceYourSelf(String product, int numberOfProduct){
        return "My name is "+firstName+" "+lastName+" and want to buy "+numberOfProduct+" "+product;
    }

}
