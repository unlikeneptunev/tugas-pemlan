public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("\n===== LINGKARAN =====");

        Lingkaran lingkaranDefault = new Lingkaran();
        System.out.println("Lingkaran Default (Jari-jari: " + lingkaranDefault.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaranDefault.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaranDefault.hitungKeliling());

        Lingkaran lingkaran1 = new Lingkaran(7.0);
        System.out.println("Lingkaran 1 (Jari-jari: " + lingkaran1.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaran1.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaran1.hitungKeliling());

        Lingkaran lingkaran2 = new Lingkaran(14);
        System.out.println("Lingkaran 2 (Jari-jari: " + lingkaran2.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaran2.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaran2.hitungKeliling());

        System.out.println("\n===== SEGIEMPAT =====");

        SegiEmpat segiEmpatDefault = new SegiEmpat();
        System.out.println("Segiempat Default (Panjang: " + segiEmpatDefault.getPanjang() + ", Lebar: " + segiEmpatDefault.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpatDefault.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpatDefault.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n\n", segiEmpatDefault.hitungDiagonal());

        SegiEmpat segiEmpat1 = new SegiEmpat(5);
        System.out.println("Segiempat 1 (Panjang: " + segiEmpat1.getPanjang() + ", Lebar: " + segiEmpat1.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpat1.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpat1.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n\n", segiEmpat1.hitungDiagonal());

        SegiEmpat segiEmpat2 = new SegiEmpat(6, 8);
        System.out.println("Segiempat 2 (Panjang: " + segiEmpat2.getPanjang() + ", Lebar: " + segiEmpat2.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpat2.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpat2.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n\n", segiEmpat2.hitungDiagonal());

    }
}
