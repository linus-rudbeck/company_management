package se.distansakademin;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String programmingLanguage){
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getSound(){
        return "Woop woop!";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
