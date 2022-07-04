package garage;

public class Wheel {
    private double pressure;
    private boolean flat = false;

    public Wheel(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }
}
