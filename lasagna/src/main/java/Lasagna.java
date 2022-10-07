public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int cookedMinutes) {
        return (expectedMinutesInOven() - cookedMinutes);
    }

    public int preparationTimeInMinutes(int layers) {
        return (layers * 2);
    }

    public int totalTimeInMinutes(int layers, int cookedMinutes) {
        return (preparationTimeInMinutes(layers) + cookedMinutes);
    }
}
