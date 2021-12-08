package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    ProductWithPiece productWithPiece = new ProductWithPiece(Type.FROZEN);

    @Test
    void testProductWithPieceInit(){
        assertEquals(1, productWithPiece.getCount());
    }

    @Test
    void testIncrementCount() {
        productWithPiece.incrementCount();

        assertEquals(2, productWithPiece.getCount());
    }
}