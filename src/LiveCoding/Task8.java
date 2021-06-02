package LiveCoding;

public class Task8 {
    public static void main(String[] args) {
        Validator y;
                y = a -> true;


        }
    }

@FunctionalInterface
interface Validator {
    boolean validate(Parcel input);
}
//TODO add if/else blocks
class Parcel {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }


}