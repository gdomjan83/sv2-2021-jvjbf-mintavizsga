package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes = new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish) {
        if ((fishes.size() + 1) * 5 > CAPACITY) {
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishes.add(fish);
    }

    public void feed() {
        for (Fish actual : fishes) {
            actual.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> fishToRemove = new ArrayList<>();
        for (Fish actual : fishes) {
            if (actual.getWeight() > maxWeight) {
                fishToRemove.add(actual);
            }
        }
        fishes.removeAll(fishToRemove);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish actual : fishes) {
            result.add(actual.getStatus());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int count = 0;
        for (Fish actual : fishes) {
            if (actual.hasMemoryLoss()) {
                count++;
            }
        }
        return count;
    }

    public boolean isThereFishWithGivenColor(String color) {
        for (Fish actual : fishes) {
            if (color.equals(actual.getColor())) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish() {
        int smallestWeight = Integer.MAX_VALUE;
        Fish smallestFish = null;
        for (Fish actual : fishes) {
            if (actual.getWeight() < smallestWeight) {
                smallestWeight = actual.getWeight();
                smallestFish = actual;
            }
        }
        return smallestFish;
    }
}
