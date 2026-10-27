package CollectionFramework;

public class PartTimeStaff extends Staf {
    int numberOfHours;
    double ratePerHour;

    PartTimeStaff(String name, String address,
                  int numberOfHours, double ratePerHour) {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return numberOfHours * ratePerHour;
    }
} 
