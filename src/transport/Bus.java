package transport;

import driver.DriverCategoryD;

public class Bus<T extends DriverCategoryD> extends Transport implements Competing{
    private T driver;
    public Bus(String brand, String model, int engineCapacity, T driver) {
        super(brand, model, engineCapacity);
        this.driver = driver;
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public void pitStop() {
        System.out.println("Truck Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Truck лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Truck максимальная скорость");
    }

    @Override
    public String toString() {
        return "Автобус={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", объем двигателя = '" + getEngineCapacity() + '\'' +
                '}';
    }
    public String homeworkTask(){
        if(getDriver() == null){
            return "Автобус никуда не поедет без водителя.";
        }else{
            return "Водитель " + getDriver().getFullName() + " управляет автобусом " + getBrand() + " " + getModel() +
                    " и будет участвовать в заезде.";
        }
    }
}
