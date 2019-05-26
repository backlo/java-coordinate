package coordinatecalculator.model;

public class Line implements Figure {
    private static final int DISTANCES_FIRST_INDEX = 0;

    private double distance;

    public Line(final Points points){
        this.distance = points.generateDistances().get(DISTANCES_FIRST_INDEX).getDistance();
    }

    @Override
    public double getResult() {
        return distance;
    }
}
