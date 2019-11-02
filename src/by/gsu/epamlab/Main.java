package by.gsu.epamlab;

public class Main {
    public static void main(String args[]) {
        //1. Creating an array of objects
        System.out.println("1. Creating an array of objects");
        BusinessTrip[] businessTrips = new BusinessTrip[]{
                new BusinessTrip("Employee 1", 100, 4),
                new BusinessTrip("Employee 2", 210, 3),
                null,
                new BusinessTrip("Employee 4", 4, 1),
                new BusinessTrip(),
        };

        //2. Output the contents of the array to the console, using show() method
        System.out.println("\n2. Output the contents of the array to the console, using show() method");
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) System.out.println(businessTrip.show() + "\n");
        }

        //3. Updating the employee`s transportation expenses for the last array object
        System.out.println("3. Updating the employee`s transportation expenses for the last array object\n");
        businessTrips[businessTrips.length - 1].setTransportationExpenses(50);

        //4 Output the total duration of two initial business trips by the single operator
        System.out.print("4. Output the total duration of two initial business trips by the single operator = ");
        System.out.println(businessTrips[0].getNumberOfDays() + businessTrips[1].getNumberOfDays() + "\n");

        //5 Output the contents of the array to the console, using toString() method
        System.out.println("5. Output the contents of the array to the console, using toString() method");
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) System.out.println(businessTrip);
        }
    }
}
