package lab_07.figuri_geo;

public class Romb extends Paralelogram{
    public int diagonala1;
    public int diagonala2;
    public Romb(int latura1, int latura2, int latura3, int latura4,
                        double unghi1, double unghi2, double unghi3, double unghi4, int diagonala1, int diagonala2) {
        super(latura1, latura2, latura3, latura4, unghi1, unghi2, unghi3, unghi4);
        this.diagonala1 = diagonala1;
        this.diagonala2 = diagonala2;
    }

    public double getArea() {
        return diagonala1 * diagonala2 / 2;
    }

    public static void main(String[] args) {
        Romb romb = new Romb(10, 20, 3, 4, 50, 6, 7, 8, 5, 6);
        System.out.println(romb.getArea());
    }
}
