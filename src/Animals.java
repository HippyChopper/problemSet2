import javax.swing.*;

public class Animals {

    private String type;
    private String continents;
    private double weight;
    private int age;



    //getters

    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String continents) {
        this.continents = continents;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //getters

    public String getType() {

        type = JOptionPane.showInputDialog("enter the type of animal?");
        return type;
    }

    public String getContinents() {
        continents = JOptionPane.showInputDialog("enter the continent of the animal?");
        return continents;
    }

    public int getAge() {
       String ageAsString = JOptionPane.showInputDialog("enter the age of animal?");
       age = Integer.parseInt(ageAsString);
        return age;
    }

    public double getWeight() {
       String weightAsString = JOptionPane.showInputDialog("enter the weight of the animal");
       weight =Double.parseDouble(weightAsString);
        return weight;
    }

    //constructer

    public Animals(){
        this.type = "no Type specified";
        this.age = 0;
        this.continents = null;
        this.weight = 0.0;
    }

    //4 arguement constructer

    public Animals(String typeData, String continentsData, int ageData, float weightData)
    {
        setType(typeData);
        setContinents(continentsData);
        setAge(ageData);
        setWeight(weightData);


    }

    @Override
    public String toString() {
        return "Type: "+ type + "\nContinent: " + continents + "\n Age: " + age + "\nweight: " + weight;
    }
}
