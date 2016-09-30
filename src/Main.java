import exercises.MyCollections;
import objects.Animal;
import objects.Customer;
import objects.Employee;

public class Main {

    public static void main(String[] args) {

        // Single comment

        /**
         * This is document block
         * that has a multiple lines
         * 3rd line :D
         */

/*

        byte byteVariable = 80; //range from -128 to 127
        short mediumRangeDecimalVariable = 12842; //range from -32768 to 32767
        int decimalVariableUpto = 2147483647;
        long largeDecimalVariableFrom = -9223372036854775808L;
        long largeDecimalVariableUpto = 9223372036854775807L;
        float numberWithDecimalPlaces = 123.1f;
        double veryLargeNumerWithDeimalPlaces = 123123123123.12312f;
        boolean isTrueOrFalse = false;
        char singleCharacter = '\uffff';
        long anotherLongVariable = 91;
        int anotherIntVariable = 9123;
        anotherLongVariable = anotherIntVariable;

        String someText = "this is a string variable";

        System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpto);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariableUpto);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumerWithDeimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(someText);
        System.out.println(anotherIntVariable);
        System.out.println(anotherLongVariable);

        System.out.println("Hello World!");
*/

        //Objects

        // START person
//        Person person = new Person();
//        person.setFirstName("Chevy");
//        person.setLastName("Banico");
//        String introduceYourSelf = person.introduceYourSelf();
//        System.out.println(introduceYourSelf);


//        Person person1 = new Person("Chevy","Banico");
//        String displayFullName = person1.introduceYourSelf();
//        System.out.println(displayFullName);
        // END person

        // START employee
        Employee employee = new Employee();
        employee.setFirstName("Mark");
        employee.setLastName("Zuckerberg");
        String introduceEmployee = employee.introduceYourSelf();
        System.out.println(introduceEmployee);
        // END employee

        // START customer
        Customer customer = new Customer();
        customer.setFirstName("Fidel");
        customer.setLastName("Soliano");
        String introduceCustomer = customer.introduceYourSelf();
        System.out.println(introduceCustomer);

        String customerWant = customer.introduceYourSelf("eggs");
        System.out.println(customerWant);

        String customerWants = customer.introduceYourSelf("eggs",7);
        System.out.println(customerWants);
        // END customer

        // START Assignment

        Animal pet = new Animal();
        pet.setPetName("Roden");
        pet.setWeightInKg(15);
        pet.setTrainable(true);
        String displayPetInfo = pet.displayPetInfo();
        System.out.println(displayPetInfo);

        // END Assignment

        MyCollections.myIfExercise();
        MyCollections.myWhileExercise1();
        MyCollections.myWhileExercise2();
        MyCollections.myDoWhile1();
        MyCollections.myArrayExercise();;
        MyCollections.myListExercise();
        MyCollections.myGirlFriends();

        MyCollections.generateRelationship();
//        MyCollections.shuffleFriendName();
    }
}
