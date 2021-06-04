package LiveCoding;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(Runner.getFitnessLevel());

    }
}

enum Runner{
    BEGINNER (220, 240),
    INTERMEDIATE(200, 219),
    ADVANCED(180, 199);

    private final int minMarathonRunTime;
    private final int maxMarathonRunTime;


    Runner(final int minMarathonRunTime, final int maxMarathonRunTime) {
        this.minMarathonRunTime = minMarathonRunTime;
        this.maxMarathonRunTime = maxMarathonRunTime;
    }

    public static Runner getFitnessLevel(){
        System.out.println("Enter the result of your marathon run: ");
        Scanner scanner = new Scanner(System.in);
        int marathonResult = scanner.nextInt();
        if(marathonResult<190){
            return ADVANCED;
        }else if(marathonResult>199 && marathonResult<220){
            return INTERMEDIATE;
        }else{
            return BEGINNER;
        }
    }
}