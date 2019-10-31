public class Worker {
    public String firstName, lastName;
    public Address address;
    public int idNumber;
    public double hoursWorked;
    public double hourlyRate;

    public String doWork(){
        return "Worker";
    }

    public Worker(String firstName, String lastName, Address address, int idNumber, double hours, double rate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    public void setHourlyRate(double rate){
        hourlyRate = rate;
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + "\nCompensation: $"+ calculatePay();
    }
}
