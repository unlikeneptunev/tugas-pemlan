public class Lingkaran {
    double jariJari;

    public Lingkaran() { // default
        this.jariJari = 1.0;
        System.out.println("Objek Lingkaran dibuat dengan jari-jari default: " + this.jariJari);
    }

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        System.out.println("Objek Lingkaran dibuat dengan jari-jari: " + this.jariJari);
    }

    public Lingkaran(int diameter) {
        this.jariJari = diameter / 2.0;
        System.out.println("Objek Lingkaran dibuat dengan diameter: " + diameter + ", jari-jari: " + this.jariJari);
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }
}