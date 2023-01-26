import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        DriverCategoryB driver1 = new DriverCategoryB("Горбунков Семён Семёнович",true,10);
        DriverCategoryC driver2 = new DriverCategoryC("Геннадий Козодоев",true,11);
        DriverCategoryD driver3 = new DriverCategoryD("Жорж Милославский",true,12);

        Car<DriverCategoryB> car1 = new Car<>("brand1","model1",0,null);
        Car<DriverCategoryB> car2 = new Car<>("brand2","model2",0,driver1);
        Car<DriverCategoryB> car3 = new Car<>("brand3","model3",0,driver1);
        Car<DriverCategoryB> car4 = new Car<>("brand4","model4",0,driver1);

        Truck<DriverCategoryC> truck1 = new Truck<>("brand1","model1",0,driver2);
        Truck<DriverCategoryC> truck2 = new Truck<>("brand2","model2",0,driver2);
        Truck<DriverCategoryC> truck3 = new Truck<>("brand3","model3",0,driver2);
        Truck<DriverCategoryC> truck4 = new Truck<>("brand4","model4",0,driver2);

        Bus<DriverCategoryD> bus1 = new Bus<>("brand1","model1",0,driver3);
        Bus<DriverCategoryD> bus2 = new Bus<>("brand2","model2",0,driver3);
        Bus<DriverCategoryD> bus3 = new Bus<>("brand3","model3",0,driver3);
        Bus<DriverCategoryD> bus4 = new Bus<>("brand4","model4",0,driver3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println();

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        System.out.println();

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        System.out.println();

        System.out.println(car1.homeworkTask());
        System.out.println(car2.homeworkTask());
        System.out.println(truck2.homeworkTask());
        System.out.println(bus3.homeworkTask());
    }
}