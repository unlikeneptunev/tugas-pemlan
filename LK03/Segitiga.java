public class Segitiga extends BangunDatar {
    private double sisiA, sisiB, sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;

    }

    @Override
    public double hitungLuas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        // Rumus Heron untuk menghitung luas segitiga menggunakan tiga sisi yang diketahui
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC)); 
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC; 
    }

    public double[] hitungSudut() {
        // Menggunakan hukum cosinus untuk menghitung sudut
        // Hitung sudut A dalam radian
        double cosA = (sisiB * sisiB + sisiC * sisiC - sisiA * sisiA) / (2 * sisiB * sisiC);
        double sudutA = Math.acos(cosA);

        // Hitung sudut B dalam radian
        double cosB = (sisiA * sisiA + sisiC * sisiC - sisiB * sisiB) / (2 * sisiA * sisiC);
        double sudutB = Math.acos(cosB);

        // Hitung sudut C dalam radian
        double cosC = (sisiA * sisiA + sisiB * sisiB - sisiC * sisiC) /  (2 * sisiA * sisiB);
        double sudutC = Math.acos(cosC);

        // Mengembalikan sudut dalam satuan derajat
        return new double[]{Math.toDegrees(sudutA), Math.toDegrees(sudutB), Math.toDegrees(sudutC)};
    }

}
