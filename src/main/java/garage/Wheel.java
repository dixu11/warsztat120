package garage;

public class Wheel {
    private double pressure;
    private boolean flat = false;

    public Wheel(double pressure) {
        this.pressure = pressure;
    }

    public void doFlatTire(){
        pressure = 0;
        flat = true;
    }

   /* public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setFlat(boolean flat) {
        this.flat = flat;
    }*/

    @Override
    public String toString() {
        return "Wheel{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }
}
