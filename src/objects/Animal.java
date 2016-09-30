package objects;

        /* TODO: Create an animal class with 3 properties and getters and setters. Data types:String,integer,boolean*/

/**
 * Created by jpmc on 9/28/2016.
 */
public class Animal {
    String petName;
    int weightInKg;
    boolean trainable;
    String isTrainableOrNot;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public boolean isTrainable() {
        return trainable;
    }

    public void setTrainable(boolean trainable) {
        this.trainable = trainable;
    }

    public String displayPetInfo(){
        if (this.trainable == true){
            isTrainableOrNot = "trainable";
        }else{
            isTrainableOrNot = "not trainable";
        }
        return "My pet's name is "+petName+", weighs "+weightInKg+"kg and it is "+isTrainableOrNot+".";
    }
}
