package task3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Zbigniew Lemiesz
 */
public class Demo {
    public static int countMaxPassengers(ArrayList<PassengerTrip> passengerList){
        ArrayList<Event> eventList = new ArrayList<>();
        for (PassengerTrip pt: passengerList) {
            eventList.add(new Event(pt.kmIn,true));
            eventList.add(new Event(pt.kmOut,false));
        }

        Collections.sort(eventList);
        System.out.println(eventList);

        int numberPassengers = 0;
        int maxNumberPassengers = 0;
        for (Event event : eventList) {
            if (event.isIn) {
                numberPassengers++;
            } else numberPassengers--;
            if (numberPassengers > maxNumberPassengers) {
                maxNumberPassengers = numberPassengers;
            }
        }
        return maxNumberPassengers;
    }


    public static void main(String[] args) {
        ArrayList<PassengerTrip> passengerList = new ArrayList<>();
        passengerList.add(new PassengerTrip(1.1f, 4f));
        passengerList.add(new PassengerTrip(0.1f, 1.32f));
        passengerList.add(new PassengerTrip(1.0f, 1.61f));
        passengerList.add(new PassengerTrip(1.91f, 21.1f));
        passengerList.add(new PassengerTrip(11.91f, 12.1f));
        passengerList.add(new PassengerTrip(10.91f, 21.1f));
        passengerList.add(new PassengerTrip(10.01f, 15.1f));

        int result = countMaxPassengers(passengerList);
        System.out.println("Max number of passengers = "+ result);
    }
}
