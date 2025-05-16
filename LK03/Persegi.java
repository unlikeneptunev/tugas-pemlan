public class Persegi extends BangunDatar {
    private double panjang, lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungDiagonal() {
        if (panjang == lebar) {
            return Math.sqrt(2) * panjang;
        } else {
            return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
        }
    }
}
