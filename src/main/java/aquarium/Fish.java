package aquarium;

public abstract class Fish {
    private String name;
    protected int weight;
    private String color;
    private boolean memoryLoss = false;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    public String getStatus() {
        return String.format("%s, weight: %d, color: %s, short-term memory loss: %s", name, weight, color, memoryLoss);
    }

    public abstract void feed();
}
