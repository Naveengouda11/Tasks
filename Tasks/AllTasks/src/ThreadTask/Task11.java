package ThreadTask;

import java.util.Random;

class AnimalRace extends Thread {
    String animalName;
    Random random = new Random();

    AnimalRace(String name) {
        this.animalName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(animalName + " running... " + i);
            try {
               
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println(animalName + " was interrupted.");
            }
        }
        System.out.println(animalName + " finished the race!");
    }
}

public class Task11 {
    public static void main(String[] args) {
        AnimalRace tortoise = new AnimalRace("Tortoise");
        AnimalRace rabbit = new AnimalRace("Rabbit");
        AnimalRace dog = new AnimalRace("Dog");

        // Start all threads
        tortoise.start();
        rabbit.start();
        dog.start();
    }
}
