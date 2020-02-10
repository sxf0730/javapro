package text;

public abstract class Shape {
    public Double area;
    public Double per;
    public String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPer() ;
    public abstract void showAll();
}
