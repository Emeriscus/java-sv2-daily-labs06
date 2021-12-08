package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("milk", Type.DIARY, 0.7));
        store.addProduct(new Product("butter", Type.DIARY, 2.3));
    }

    @Test
    void testAddProduct() {
        store.addProduct(new Product("kifli", Type.FROZEN, 0.15));
        assertEquals(0.15, store.getProducts().get(2).getPrice());
        assertEquals(3, store.getProducts().size());
    }

    @Test
    void testNumberOfProductByOneType() {
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(Type.DIARY, result.get(0).getType());
        assertEquals(2, result.get(0).getCount());
    }

    @Test
    void testNumberOfProductByMoreTypeTest() {
        store.addProduct(new Product("kifli", Type.FROZEN, 0.15));
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(2, result.size());
        assertEquals(Type.FROZEN, result.get(1).getType());
        assertEquals(1, result.get(1).getCount());
        assertEquals(2, result.get(0).getCount());
    }

    @Test
    void testNumberOfProductEmptyProductsList(){
        Store store = new Store();
        store.numberOfProductsByType();

        assertEquals(0, store.getProducts().size());
    }
}