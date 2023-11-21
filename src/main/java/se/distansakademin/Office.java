package se.distansakademin;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Office {
    private static final int RENT_SMALL_OFFICE = 3200;
    private static final int RENT_LARGE_OFFICE = 2785;
    private static final int OFFICE_SIZE_BREAKPOINT = 20;
    private static final int OFFICE_TAX = 150;

    private final double size;

    public Office(double size) {
        this.size = size;
    }


    public double getMonthlyRent() {
        double yearlyRent = getYearlyRent();

        double monthlyRent = round(yearlyRent / 12);

        return monthlyRent;
    }

    private double getYearlyRent() {
        double yearlySpaceRent = getYearlySpaceRent();
        double yearlyTax = getYearlyTax();

        return yearlySpaceRent + yearlyTax;
    }

    private double getYearlyTax() {
        return OFFICE_TAX * size;
    }

    private double getYearlySpaceRent() {
        if(size < OFFICE_SIZE_BREAKPOINT){
            return RENT_SMALL_OFFICE *size;
        }
        else{
            return RENT_LARGE_OFFICE*size;
        }
    }

    private double round(double value) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
