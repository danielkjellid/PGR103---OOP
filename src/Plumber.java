public class Plumber extends Worker { //Enables the class to use the public attributes of Worker.java
    private double plumbingMaterials = 0;

    public Plumber(String firstName, String lastName, Address address, int idNumber, double hours, double rate) {
        super(firstName, lastName, address, idNumber, hours, rate); //Uses the Worker constructor to get name, address, id, hours and rate.
    }

    public void setPlumbingCosts(double amount) {
        plumbingMaterials = amount;
    }

    public String doWork() { //Overridden to allow carpenter to do specific carpenter-work.
        return "Install plumbing";
    }

    @Override
    public String toString() { //Overridden to return Carpenter information in string.
        return "Plumber: " + super.toString() + "\n" + doWork();
    }

    public double calculatePay() { //Overrides calculatePay() method, since a carpenter might have additional lumber costs.
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}