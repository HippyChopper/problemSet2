public class Bicycle {

    private String name;
    private String make;
    private int value;

    //no arguement constructer
    public Bicycle(){
        this.name = "name";
        this.make = "make";
        this.value = 0;
    }



    //getters

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public int getValue() {
        return value;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return "Customer name: " + name + "\nMake: " + make + "\nvalue:" + value;
    }


}
