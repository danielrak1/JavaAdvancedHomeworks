package LiveCoding;

public class Task15 {
    public static void main(String[] args) {
        GoodCar ferrari = GoodCar.FERRARI;
        GoodCar porsche = GoodCar.PORSCHE;
        System.out.println(ferrari.isPremium());
        System.out.println(ferrari.isRegular());

        System.out.println(GoodCar.isFasterThan(porsche, ferrari));
    }
}

enum GoodCar {
    FERRARI(450, 25000),
    PORSCHE(420, 20000),
    MERCEDES(400, 23000),
    BMW(350, 15000),
    MAZDA(190, 10000),
    TOYOTA(100, 11000);

    private final int horsePower;
    private final int price;

    GoodCar(final int horsePower, final int price) {
        this.horsePower = horsePower;
        this.price = price;
    }

    public boolean isPremium() {
        if (price > 14000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRegular() {
        if (isPremium()) {
            return false;
        } else {
            return true;
        }
    }

    protected static boolean isFasterThan(GoodCar car1, GoodCar car2) {
        if (car1.compareTo(car2) < 1) {
            return true;
        } else return false;
    }

}