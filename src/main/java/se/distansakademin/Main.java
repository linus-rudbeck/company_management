package se.distansakademin;

public class Main {
    public static void main(String[] args) {
        double[] officeSizes = {42.7, 20.9, 38.7, 24.3, 12.5, 14.8, 14.0};

        for(var size : officeSizes){
            Office office = new Office(size);
            double rent = office.getMonthlyRent();

            System.out.println(size + rent);
        }
    }
}