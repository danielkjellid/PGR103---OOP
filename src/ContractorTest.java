import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ContractorTest {
    public static void main(String[] args){
        //Project 1
        Address client1 = new Address("31 Spooner Street", "Quahog", "RI","02860");
        LocalDate start1 = LocalDate.parse("2019-04-12");
        LocalDate end1 = LocalDate.parse("2019-04-30");
        Project p1 = new Project("House", "Peter Griffin", client1, start1, end1);

        //Project 2
        Address client2 = new Address("742 Evergreen Terrace", "Springfield", "SF", "04234");
        LocalDate start2 = LocalDate.parse("2019-05-01");
        LocalDate end2 = LocalDate.parse("2019-04-14");
        Project p2 = new Project("Outdoor motion lighting", "Homer Simpson", client2, start2, end2);

        //Worker addresses
        Address eAddress = new Address("98 Parkville Ave", "Brooklyn", "NY", "11230");
        Address cAddress = new Address("28201 E. Bonanza St.", "South Park", "CO", "80022");
        Address pAddress = new Address("416 Cherry Street","Apt 1" ,"Langley Falls", "VA", "23655");


        //Workers
        Worker e = new Electrician("Philip", "J. Fry", eAddress, 2345, 20, 30);
        Worker c = new Carpenter("Eric", "Cartman", cAddress, 9856, 35, 30);
        Worker p = new Plumber("Stan", "Smith", pAddress, 5678, 15, 24);


        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(e);
        workers.add(c);
        workers.add(p);
        ((Electrician)e).setWiringCosts(3200);
        ((Carpenter)c).setLumberCosts(2000);
        ((Plumber)p).setPlumbingCosts(2750);
        p1.addWorkers(workers);
        p1.setOverhead(.18);

        System.out.printf(p1.toString(), p1.getName(), p1.getTotalCost(), p1.getOverhead());
        System.out.println("***************************************************" + "\n***************************************************\n");

        workers.remove(p); //p2 does not need a plumber
        workers.remove(c); //p2 does not need a carpenter
        ((Electrician)e).setWiringCosts(300);
        workers.get(0).setHoursWorked(20); //set the hours worked to 20
        p2.addWorkers(workers);

        System.out.printf(p2.toString(), p2.getName(), p2.getTotalCost(), p2.getOverhead());

        if(p2.compareTo(p1) < 0) {
            System.out.println("\nThe " + p2.getName() + " project is " + "scheduled prior to " + p1.getName());
        } else {
            System.out.println("\nThe "+p1.getName()+" project is " + "scheduled prior to " +p2.getName());
        }

        System.out.println("\n");
    }
}
