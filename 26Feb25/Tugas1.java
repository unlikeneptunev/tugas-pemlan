import java.util.Scanner;

public class Tugas1 {
    Scanner sc = new Scanner(System.in);

    class Lingkaran {
        double jariJari;
        boolean inputValid = true;

        Lingkaran() {
            System.out.print("Masukkan jari-jari lingkaran: ");
            this.jariJari = sc.nextDouble();

            if (this.jariJari < 0) {
                System.out.println("Input tidak valid: jari-jari tidak boleh negatif");
                inputValid = false;
            }
        }
        
        double luas() {
            if (inputValid == true) {
                return Math.PI * Math.pow(jariJari, 2);
            } else {
                return 0;
        }
    }
}

    class Segiempat {
        double sisi;
        boolean inputValid = true;

        Segiempat() {
            System.out.print("Masukkan sisi segiempat: ");
            this.sisi = sc.nextDouble();

            if (this.sisi < 0) {
                System.out.println("Input tidak valid: sisi tidak boleh negatif");
                inputValid = false;
            }
        }

        double keliling() {
            if (inputValid == true) {
                return 4 * sisi;
            } else {
                return 0;
            }
        }

        double luas() {
            if (inputValid == true) {
                return sisi * sisi;
            } else {
                return 0;
            }
        }

        double diagonal() {
            if (inputValid == true) {
                return sisi * Math.sqrt(2);
            } else {
                return 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Tugas1 tugas1 = new Tugas1();

        // Lingkaran
        Lingkaran lingkaran = tugas1.new Lingkaran();
        System.out.printf("Luas Lingkaran = %.2f\n\n", lingkaran.luas());

        // Segiempat
        Segiempat segiempat = tugas1.new Segiempat();
        System.out.printf("Keliling Segiempat = %.2f\n", segiempat.keliling());
        System.out.printf("Luas Segiempat = %.2f\n", segiempat.luas());
        System.out.printf("Diagonal Segiempat = %.2f\n", segiempat.diagonal());
        
        }
    }

// Hitung luas lingkaran
// Hitung keliling, luas dan diagonal segiempat (persegi panjang)
// Pakai konsep OOP
