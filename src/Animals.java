import javax.swing.*;

public class Animals {

    private String type;
    private String[] continents;
    private double weight;
    private int age;



    //setters

    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents)
    {
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

    public String[] getContinents() {
    String[] continents = new String[4];
        for (int i = 0; i < continents.length; i++){
            continents[i] = JOptionPane.showInputDialog("please enter the continent:");
        }
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

    public Animals(String typeData, String continentsData[], int ageData, float weightData)
    {
        setType(typeData);
        setContinents(continentsData);
        setAge(ageData);
        setWeight(weightData);


    }

    @Override
    public String toString() {

        String conts="";

        if (conts!= null){

            for (int i = 0;i <continents.length; i++)
            {
                conts+= continents[i] + ", ";
            }

        }
        else conts = "no continents specified";
        return "Type: "+ type + "\nContinent: " + conts+ "\n Age: " + age + "\nweight: " + weight;
    }
}
