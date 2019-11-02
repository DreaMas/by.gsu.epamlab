package by.gsu.epamlab;

public class BusinessTrip {
    private static final String FIELD_SEPARATOR = ";";
    private static final int DAILY_ALLOWANCE_RATE = 700;

    private String employee;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {
        this.employee = "";
    }

    public BusinessTrip(String employee, int transportationExpenses, int numberOfDays) {
        this.employee = employee;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTotal() {
        return this.transportationExpenses + DAILY_ALLOWANCE_RATE * this.numberOfDays;
    }

    private String moneyToString(int value) {
        return String.format("%d.%02d", value / 100, value % 100);
    }

    public String show() {
        String result = "rate = " + moneyToString(DAILY_ALLOWANCE_RATE);
        result += "\naccount = " + this.employee;
        result += "\ntransport = " + moneyToString(this.transportationExpenses);
        result += "\ndays = " + this.numberOfDays;
        result += "\ntotal = " + moneyToString(getTotal());
        return result;
    }

    @Override
    public String toString() {
        String result = this.employee + FIELD_SEPARATOR;
        result += moneyToString(this.transportationExpenses) + FIELD_SEPARATOR;
        result += this.numberOfDays + FIELD_SEPARATOR;
        result += moneyToString(getTotal());
        return result;
    }
}
