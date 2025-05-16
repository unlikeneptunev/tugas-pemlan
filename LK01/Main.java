public class Main {
    public static void main(String[] args) throws Exception {
        
        // Perhitungan Lingkaran
        System.out.println("===== LINGKARAN =====");
        
        Lingkaran lingkaran1 = new Lingkaran(7);
        System.out.println("Lingkaran 1 (Jari-jari: " + lingkaran1.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaran1.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaran1.hitungKeliling());
        
        Lingkaran lingkaran2 = new Lingkaran(14);
        System.out.println("Lingkaran 2 (Jari-jari: " + lingkaran2.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaran2.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaran2.hitungKeliling());
        
        Lingkaran lingkaran3 = new Lingkaran(21);
        System.out.println("Lingkaran 3 (Jari-jari: " + lingkaran3.getJariJari() + ")");
        System.out.printf("Luas      = %.2f\n", lingkaran3.hitungLuas());
        System.out.printf("Keliling  = %.2f\n\n", lingkaran3.hitungKeliling());
        
        // Perhitungan SegiEmpat
        System.out.println("===== SEGIEMPAT =====");
        
        // Persegi
        SegiEmpat segiEmpat1 = new SegiEmpat(5, 5);  
        System.out.println("Segi Empat 1 (Panjang: " + segiEmpat1.getPanjang() + 
                          ", Lebar: " + segiEmpat1.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpat1.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpat1.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n\n", segiEmpat1.hitungDiagonal());
        
        // Persegi panjang
        SegiEmpat segiEmpat2 = new SegiEmpat(6, 8);  
        System.out.println("Segi Empat 2 (Panjang: " + segiEmpat2.getPanjang() + 
                          ", Lebar: " + segiEmpat2.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpat2.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpat2.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n\n", segiEmpat2.hitungDiagonal());
        
        SegiEmpat segiEmpat3 = new SegiEmpat(10, 4);
        System.out.println("Segi Empat 3 (Panjang: " + segiEmpat3.getPanjang() + 
                          ", Lebar: " + segiEmpat3.getLebar() + ")");
        System.out.printf("Luas      = %.2f\n", segiEmpat3.hitungLuas());
        System.out.printf("Keliling  = %.2f\n", segiEmpat3.hitungKeliling());
        System.out.printf("Diagonal  = %.2f\n", segiEmpat3.hitungDiagonal());
    }
}