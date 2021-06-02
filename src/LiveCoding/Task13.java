package LiveCoding;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {

        CarService service = new CarService();
        service.addToList("BMW");
        service.addToList("Audi");
        service.addToList("Opel");
        service.removeFromList("Opel");
        System.out.println(service.returnCarList());


    }
}

class CarService {
    List<String> carList = new ArrayList<>();

    public void addToList(String car){
        carList.add(car);
    }
    public void removeFromList(String car){
        carList.remove(car);
    }
    public List<String> returnCarList(){
//        for(String car :carList){
//            System.out.println(car);
//        }
        return carList;
    }

    public List<Car> getV12Cars(List<Car> carList){
        List<Car> answer = new ArrayList<>();
        for (Car car : carList){
            car.getEngine().equals(EngineType.V12);
            answer.add(car);
        }
        return answer;
    }

//    public List<Car> getCarsBefore1999(){
//        carList.stream();
//
//    }

    public void getMostExpensiveCar(){

    }
    public void getCheapestCar(){

    }







}