package classes;

class rightAngleTriangle {
    private double length;
    private double height;

    public rightAngleTriangle(double x, double y) {
        length = x;
        height = y;
    }

    public double area(){
        return (length*height/2.0);
    }

    public static double test(rightAngleTriangle rt){
        System.out.println(rt);
        return rt.area();
    }
}