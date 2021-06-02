package LiveCoding;

/* Create a Manufacturer class that will contain fields:
name, year of establishment, country. Include all
necessary methods and constructor parameters.
Implement the hashCode() and equals() methods.

Create a Car class that will contain fields:
name, model, price, year of manufacture, manufacturer list
(Manufacturer), and engine type (represented as the enum class,
 e.g. V12, V8, V6, S6, S4, S3). Include all
necessary methods and constructor parameters.
Implement the hashcode() and equals() methods
*/

import java.util.Objects;

public class Task12 {
    public static void main(String[] args) {

        Manufacturer m1 = new Manufacturer("Audi", 1930, "Germany");
        Manufacturer m2 = new Manufacturer("Audi", 1930, "Germany");
        System.out.println(m1.equals(m2));
        System.out.println("m1: " + m1.hashCode() + "\nm2: " + m2.hashCode());

        Car c1 = new Car("Audi", "80", 500,
                1995, m1, EngineType.S4);

        Car c2 = new Car("Audi", "RS6", 20000,
                2018, m1, EngineType.S6);
        System.out.println(c1.equals(c2));
        System.out.println("c1: " + c1.hashCode() + "\nc2: " + c2.hashCode());
    }
}

class Manufacturer {
    String name;
    int yearOfEstablishment;
    String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;

        if (!(obj instanceof Manufacturer)) return false;

        Manufacturer manufacturer = (Manufacturer) obj;

        return manufacturer.getName().equals(name) &&
                manufacturer.getCountry().equals(country);

    }
}

class Car {
    String make;
    String model;
    int price;
    int yearOfManufacture;
    Manufacturer manufacturerList;
    EngineType engine;

    public Car(String make, String model, int price, int yearOfManufacture, Manufacturer manufacturerList, EngineType engine) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Manufacturer getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(Manufacturer manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                yearOfManufacture == car.yearOfManufacture &&
                make.equals(car.make) &&
                model.equals(car.model) &&
                manufacturerList.equals(car.manufacturerList) &&
                engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price, yearOfManufacture, manufacturerList, engine);
    }
}

enum EngineType {
    V12,
    V10,
    V8,
    V6,
    S6,
    S4,
    S3
}

