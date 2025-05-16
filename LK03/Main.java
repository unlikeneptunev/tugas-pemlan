public class Main {
    public static void main(String[] args) {
        BangunDatar[] bangunDatar = {
            new Persegi(10, 10), // Bujur sangkar
            new Persegi(15, 8), // Persegi panjang
            
            new Segitiga(10, 10, 10),
            new Segitiga(3, 4, 5),
            
            new Lingkaran(5),
            new Lingkaran(35.5)
        };

        System.out.println("=============================================");
        System.out.println("|        HASIL PERHITUNGAN BANGUN DATAR     |");
        System.out.println("=============================================\n");

        for (BangunDatar bangun : bangunDatar) {
            System.out.println("---------------------------------------------");
            System.out.printf("| %-18s : %s%n", "Tipe Bangun Datar", bangun.getClass().getSimpleName());
            System.out.printf("| %-18s : %8.2f%n", "Luas", bangun.hitungLuas());
            System.out.printf("| %-18s : %8.2f%n", "Keliling", bangun.hitungKeliling());

            if (bangun instanceof Persegi) {
                Persegi persegi = (Persegi) bangun;
                System.out.printf("| %-18s : %8.2f%n", "Diagonal", persegi.hitungDiagonal());
            } else if (bangun instanceof Segitiga) {
                Segitiga segitiga = (Segitiga) bangun;
                double[] sudut = segitiga.hitungSudut();
                System.out.printf("| %-18s : %8.2f°%n", "Sudut A", sudut[0]);
                System.out.printf("| %-18s : %8.2f°%n", "Sudut B", sudut[1]);
                System.out.printf("| %-18s : %8.2f°%n", "Sudut C", sudut[2]);
            } else if (bangun instanceof Lingkaran) {
                Lingkaran lingkaran = (Lingkaran) bangun;
                System.out.printf("| %-18s : %8.2f%n", "Diameter", lingkaran.hitungDiameter());
            }

            System.out.println("---------------------------------------------\n");
        }

        System.out.println("=============================================");
        System.out.println("|            PERHITUNGAN SELESAI            |");
        System.out.println("=============================================");
    }
}
