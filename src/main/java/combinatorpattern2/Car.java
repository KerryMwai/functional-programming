package combinatorpattern2;

import java.time.LocalDate;

public class Car {
    private final String carname;
    private final String carnumber;
    private final LocalDate yearofmanufacture;
    private final String cardriver;
    private final String driverphonenumber;
    private final String driverid;
    private final LocalDate driveryearofbirth;
    private final String driverregistrationstatus;


    public Car(String carname, String carnumber, LocalDate yearofmanufacture, String cardriver, String driverphonenumber, String driverid, LocalDate driveryearofbirth, String driverregistrationstatus) {
        this.carname = carname;
        this.carnumber = carnumber;
        this.yearofmanufacture = yearofmanufacture;
        this.cardriver = cardriver;
        this.driverphonenumber = driverphonenumber;
        this.driverid = driverid;
        this.driveryearofbirth = driveryearofbirth;
        this.driverregistrationstatus = driverregistrationstatus;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public LocalDate getYearofmanufacture() {
        return yearofmanufacture;
    }

    public String getCardriver() {
        return cardriver;
    }

    public String getDriverphonenumber() {
        return driverphonenumber;
    }

    public String getDriverid() {
        return driverid;
    }

    public LocalDate getDriveryearofbirth() {
        return driveryearofbirth;
    }

    public String getDriverregistrationstatus() {
        return driverregistrationstatus;
    }

}
