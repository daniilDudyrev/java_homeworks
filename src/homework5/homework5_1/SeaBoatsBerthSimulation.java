package homework5.homework5_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SeaBoatsBerthSimulation {
    private int maxCapacity;
    private int maxWaitingTime;
    private int maxInterval;

    private Queue<Integer> passengersQueue;

    public SeaBoatsBerthSimulation(int maxCapacity, int maxWaitingTime, int maxInterval) {
        this.maxCapacity = maxCapacity;
        this.maxWaitingTime = maxWaitingTime;
        this.maxInterval = maxInterval;
        passengersQueue = new LinkedList<>();
    }

    public void simulate() {
        Random random = new Random();

        int currentTime = 0;
        int totalPassengerWaitTime = 0;
        int totalPassengerCount = 0;
        int maxPassengerCount = 0;

        while (currentTime < 24 * 60) {
            int passengersArrivalInterval = generatePassengersArrivalInterval(currentTime);
            int passengersCount = random.nextInt(maxCapacity);
            passengersQueue.add(passengersCount);
            totalPassengerCount += passengersCount;
            maxPassengerCount = Math.max(maxPassengerCount, passengersQueue.size());

            int ferryArrivalInterval = generateSeaBoatArrivalInterval(currentTime);
            if (passengersQueue.isEmpty()) {
                System.out.println("Sea boat arrived and departed without stopping");
            } else {
                int passengersInBoat = Math.min(passengersQueue.poll(), maxCapacity);
                totalPassengerWaitTime += passengersInBoat * passengersArrivalInterval;
                System.out.println("Sea boat arrived, served " + passengersInBoat + " passengers");
            }

            currentTime += Math.max(passengersArrivalInterval, ferryArrivalInterval);
        }

        double averagePassengerWaitTime = (double) totalPassengerWaitTime / totalPassengerCount;
        int sufficientInterval = maxPassengerCount * maxWaitingTime;

        System.out.println("Average passenger wait time: " + averagePassengerWaitTime);
        System.out.println("Sufficient interval between sea boat arrivals: " + sufficientInterval);
    }

    private int generatePassengersArrivalInterval(int currentTime) {
        Random random = new Random();
        return random.nextInt(maxWaitingTime) + 1;
    }

    private int generateSeaBoatArrivalInterval(int currentTime) {
        Random random = new Random();
        return random.nextInt(maxInterval) + 1;
    }

}
