package se.distansakademin;

public class Employee {

    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getSound(){
        return "Aaow!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
