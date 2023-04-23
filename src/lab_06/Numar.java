package lab_06;

public class Numar {
    private int nr;

    public Numar(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int sum(int a, Integer b, Integer c, Integer d) {
        if (b == null) {
            b = 0;
        }
        if (c == null) {
            c = 0;
        }
        if (d == null) {
            d = 0;
        }

        return this.nr + a + b + c + d;
    }

    public static void main(String[] args) {
        Numar num = new Numar(5);
        System.out.println(num.sum(3, null, null, null));
        System.out.println(num.sum(3, 4, null, null));
        System.out.println(num.sum(3, 4, 5, null));
        System.out.println(num.sum(3, 4, 5, 6));
    }
}
