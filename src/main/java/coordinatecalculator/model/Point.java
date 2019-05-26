package coordinatecalculator.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
    private static final int SQUARE_NUMBER = 2;

    private final XPoint xPoint;
    private final YPoint yPoint;

    public Point(String inputPoint) {
        Matcher matcher = Pattern.compile("\\(([0-9]*),([0-9]*)\\)").matcher(inputPoint);
        if (!matcher.find()) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }
        this.xPoint = new XPoint(matcher.group(1));
        this.yPoint = new YPoint(matcher.group(2));
    }

    public XPoint getxPoint() {
        return xPoint;
    }

    public YPoint getyPoint() {
        return yPoint;
    }

    public int square(Point anotherPoint) {
        return (int) (Math.pow(this.xPoint.subtract(anotherPoint.xPoint.getValue()), SQUARE_NUMBER)
                + Math.pow(this.yPoint.subtract(anotherPoint.yPoint.getValue()), SQUARE_NUMBER));
    }

    public boolean isDifferentXYValue(Point point) {
        return !xPoint.equals(point.xPoint) && !yPoint.equals(point.yPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(xPoint, point.xPoint) &&
                Objects.equals(yPoint, point.yPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPoint, yPoint);
    }
}
