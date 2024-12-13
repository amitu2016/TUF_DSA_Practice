package sebi.previous.y2022;

import java.util.*;

//5. Train arrival and waiting time given. Priority train present. Output departure times accordingly.

class Train {
    int id;
    int arrivalTime;
    int waitingTime;
    boolean isPriority;

    public Train(int id, int arrivalTime, int waitingTime, boolean isPriority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.waitingTime = waitingTime;
        this.isPriority = isPriority;
    }

    public int getDepartureTime() {
        return arrivalTime + waitingTime;
    }
}

public class TrainSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of trains: ");
        int n = sc.nextInt();

        List<Train> trains = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival time, waiting time, and priority (1 for priority, 0 otherwise) for train " + (i + 1) + ": ");
            int arrivalTime = sc.nextInt();
            int waitingTime = sc.nextInt();
            boolean isPriority = sc.nextInt() == 1;
            trains.add(new Train(i + 1, arrivalTime, waitingTime, isPriority));
        }

        // Sort trains by priority (descending), then by arrival time (ascending)
        trains.sort((t1, t2) -> {
            if (t1.isPriority != t2.isPriority) {
                return t1.isPriority ? -1 : 1;
            }
            return Integer.compare(t1.arrivalTime, t2.arrivalTime);
        });

        System.out.println("\nScheduled Departure Times:");
        int currentTime = 0;
        for (Train train : trains) {
            if (train.arrivalTime > currentTime) {
                currentTime = train.arrivalTime; // Wait for the train to arrive
            }
            int departureTime = currentTime + train.waitingTime;
            System.out.println("Train " + train.id + " departs at time " + departureTime);
            currentTime = departureTime; // Update current time
        }

        sc.close();
    }
}
