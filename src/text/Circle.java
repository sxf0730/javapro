package text;

public  class Circle extends Shape {
    private int radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius=radius;
    }
    public Circle(String color){

    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPer() {
        return 3.14*radius*2;
    }

    @Override
    public void showAll() {
        System.out.println("圆面积"+getArea());
        System.out.println("圆周长"+getPer());
        System.out.println("圆颜色"+getColor());
    }
}
