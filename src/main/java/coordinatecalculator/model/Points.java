package coordinatecalculator.model;


import java.util.*;

public class Points {

    private List<Point> points;

    private Points() {
        this.points = new ArrayList<>();
    }

    public static Points create() {
        return new Points();
    }

    public void addPoint(Point point) {
        if (this.points.contains(point)) {
            throw new IllegalArgumentException("두점이 중복되었습니다.");
        }
        this.points.add(point);
    }

    public Point getPoint(int index) {
        return this.points.get(index);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getSize() {
        return points.size();
    }

    public List<Distance> generateDistances() {
        List<Distance> distances = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            distances.add(this.getDistance(i, (i + 1) % points.size()));
        }
        return distances;
    }

    private Distance getDistance(int previousPointIndex, int currentPointIndex) {
        return new Distance(this.getPoint(previousPointIndex), this.getPoint(currentPointIndex));
    }

}
