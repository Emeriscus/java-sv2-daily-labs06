package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("BestCars", 100);

    @BeforeEach
    void init() {
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 80));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 70));
        carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 30));
    }

    @Test
    void createCarShopTest() {
        CarShop carShop = new CarShop("BestCars", 100);

        assertEquals("BestCars", carShop.getShopName());
        assertEquals(100, carShop.getMaxPrice());
        assertEquals(0, carShop.getCarsForSell().size());
    }

    @Test
    void addCarWithValidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 99));

        assertTrue(result);
        assertEquals(4, carShop.getCarsForSell().size());
        assertEquals("Toyota", carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest() {
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLUE, 101));

        assertFalse(result);
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void sumCarPriceTest() {
        assertEquals(180, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThanTest() {

        int expected = carShop.numberOfCarsCheaperThan(80);
        int expected2 = carShop.numberOfCarsCheaperThan(71);

        assertEquals(3, expected);
        assertEquals(2, expected2);
    }

    @Test
    void carsWithBrandTest(){
        List<Car> expected = carShop.carsWithBrand("Toyota");

        assertEquals(3, expected.size());
        assertEquals("Toyota", expected.get(0).getBrand());
    }
}