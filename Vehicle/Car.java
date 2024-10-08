package Vehicle;

public class Car extends Vehicle {
    String company;
    public Car(String Make, String Color, int Year, String Company ){
        make = Make;
        color = Color;
        makeYear = Year;
        company = Company;
    }
    @Override
    public void showAtts() {
        super.showAtts();
        System.out.printf("Make: %s, Color: %s, Year: %d, Company: %s", make, color, makeYear, company);
    }
}
