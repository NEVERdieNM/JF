public class EquilateralTriangle implements RegularPolygon {

    float sideLength;

    public EquilateralTriangle(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public float getSideLength() {
        return this.sideLength;
    }
    
}