package Vehicle;

public class Motorcycle extends Vehicle {
    String company;

    public Motorcycle(String Make, String Color, int Year, String Company ){
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
