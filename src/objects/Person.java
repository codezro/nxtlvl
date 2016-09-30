package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String userName;
    private String email;
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){

        /* TODO check if string is from a-z */

        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String introduceYourSelf(){
        return "Hi I'm "+firstName+" "+lastName;
    }

    public Person(){
    }

    public Person(String fname, String lname){
        setFirstName(fname);
        setLastName(lname);
    }
}
