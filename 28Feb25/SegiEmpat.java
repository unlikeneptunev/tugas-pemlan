public class SegiEmpat {
    double panjang;
    double lebar;

    public SegiEmpat() { // default
        this.panjang = 1.0;
        this.lebar = 1.0;
        System.out.println("Objek SegiEmpat dibuat dengan nilai default: panjang = " + this.panjang + ", lebar = " + this.lebar);
    }

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Objek SegiEmpat dibuat dengan panjang = " + this.panjang + ", lebar = " + this.lebar);
    }

    public SegiEmpat(double sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        System.out.println("Objek SegiEmpat (persegi) dibuat dengan sisi = " + sisi);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungDiagonal() {
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}