public class SegiEmpat {
    double panjang;
    double lebar;
    
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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