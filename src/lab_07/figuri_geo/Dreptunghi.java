package lab_07.figuri_geo;

public class Dreptunghi extends Paralelogram{
    public Dreptunghi(int latura1, int latura2, int latura3, int latura4,
                        double unghi1, double unghi2, double unghi3, double unghi4) {
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
    }

    public double getArea() {
        return super.latura1 * super.latura2;
    }

    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi(10, 20, 3, 4, 50, 6, 7, 8);
        System.out.println(dreptunghi.getArea());
    }
}
