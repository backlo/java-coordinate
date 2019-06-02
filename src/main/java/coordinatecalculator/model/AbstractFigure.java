package coordinatecalculator.model;

public abstract class AbstractFigure implements Figure {

    protected final Points points;

    AbstractFigure(Points points) {
        this.points = points;
    }

}
