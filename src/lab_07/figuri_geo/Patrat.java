package lab_07.figuri_geo;

public class Patrat extends Dreptunghi{
    public Patrat(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    public double getArea() {
        return super.latura1 * super.latura1;
    }

    public static void main(String[] args) {
        Patrat patrat = new Patrat(10, 10, 10, 10, 90, 90, 90, 90);
        System.out.println(patrat.getArea());
    }
}
