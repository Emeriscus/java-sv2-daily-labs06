package day05;

public class ProductWithPiece {

    private Type type;
    private int count = 1;

    public ProductWithPiece(Type type) {
        this.type = type;
    }

    public void incrementCount() {
        count++;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}
