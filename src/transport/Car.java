package transport;

import driver.DriverCategoryB;

public class Car<T extends DriverCategoryB> extends Transport implements Competing{
    private T driver;
    public Car(String brand, String model, int engineCapacity, T driver) {
        super(brand,model,engineCapacity);
        this.driver = driver;
    }

    @Override
    public void pitStop() {
        System.out.println("Car Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Car лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Car максимальная скорость");
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", объем двигателя = '" + getEngineCapacity() + '\'' +
                '}';
    }

    public String homeworkTask(){
        if(getDriver() == null){
            return "Автомобиль никуда не поедет без водителя.";
        }else{
            return "Водитель " + getDriver().getFullName() + " управляет легковым автомобилем " + getBrand() + " " + getModel() +
                    " и будет участвовать в заезде.";
        }
    }
}
