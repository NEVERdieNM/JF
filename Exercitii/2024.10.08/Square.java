public class Square implements RegularPolygon {

    float sideLength;

    public Square(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public float getSideLength() {
        return this.sideLength;
    }
    
}
