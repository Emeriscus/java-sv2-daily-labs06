package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String shopName;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String shopName, int maxPrice) {
        this.shopName = shopName;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carsForSell.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sumCarPrice = 0;

        for (Car actualCar : carsForSell) {
            sumCarPrice += actualCar.getPrice();
        }
        return sumCarPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCarsCheaperThan = 0;

        for (Car actualcar : carsForSell) {
            if (actualcar.getPrice() <= price) {
                numberOfCarsCheaperThan++;
            }
        }
        return numberOfCarsCheaperThan;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithBrand = new ArrayList<>();

        for (Car actual : carsForSell) {
            if (actual.getBrand().equals(brand)) {
                carsWithBrand.add(actual);
            }
        }
        return carsWithBrand;
    }

    public String getShopName() {
        return shopName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}
