package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void createProductTest(){
        Product product=new Product("Milk", Type.DIARY, 2.0);

        assertEquals("Milk", product.getName());
        assertEquals(Type.DIARY, product.getType());
        assertEquals(2.0, product.getPrice());
    }
}