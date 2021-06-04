package LiveCoding;

import java.util.Objects;

public class Task19 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("i7", 16, "gtx1070",
                "Dell", "7567", 5);
        Laptop laptop2 = new Laptop("i7", 16, "gtx1070",
                "Dell", "7567", 6);
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.hashCode() + "\n" + laptop2.hashCode());
        System.out.println(laptop1.toString());

    }
}

class Laptop extends Computer {

    int battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery=battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getBattery(), laptop.getBattery());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery());
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}