import java.util.Date;
import java.util.Calendar;

public class Perpustakaan {
    // Array dengan kapasitas maksimum 10
    private static final Buku[] LIST_BUKU = new Buku[10];
    private static final Anggota[] LIST_ANGGOTA = new Anggota[10];
    private static final TransaksiPeminjaman[] LIST_TRANSAKSI = new TransaksiPeminjaman[10];
    private static int jumlahBuku = 0;
    private static int jumlahAnggota = 0;
    private static int jumlahTransaksi = 0;

    // Menambahkan buku ke dalam daftar
    public static void tambahBuku(Buku buku) {
        if (jumlahBuku < LIST_BUKU.length) {
            LIST_BUKU[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku dengan ID " + buku.getIdBuku() + " berhasil ditambahkan!");
        } else {
            System.out.println("Daftar buku sudah penuh!");
        }
    }

    // Menambahkan anggota ke dalam daftar
    public static void tambahAnggota(Anggota anggota) {
        if (jumlahAnggota < LIST_ANGGOTA.length) {
            LIST_ANGGOTA[jumlahAnggota] = anggota;
            jumlahAnggota++;
            System.out.println("Anggota dengan ID " + anggota.getIdAnggota() + " berhasil ditambahkan!");
        } else {
            System.out.println("Daftar anggota sudah penuh!");
        }
    }

    // Memproses transaksi peminjaman buku
    public static void pinjamBuku(String idAnggota, String idBuku) {
        if (jumlahTransaksi < LIST_TRANSAKSI.length) {
        Anggota anggota = null;
        Buku buku = null;
        // Mencari anggota berdasarkan ID
        for (int i = 0; i < jumlahAnggota; i++) {
            if (LIST_ANGGOTA[i].getIdAnggota().equals(idAnggota)) {
                anggota = LIST_ANGGOTA[i];
                break;
            }
        }
        // Mencari buku berdasarkan ID
        for (int i = 0; i < jumlahBuku; i++) {
            if (LIST_BUKU[i].getIdBuku().equals(idBuku)) {
                buku = LIST_BUKU[i];
                break;
            }
        }
        if (anggota == null) {
            System.out.println("Anggota dengan ID " + idAnggota + " tidak ditemukan!");
            if (buku == null) {
                System.out.println("Buku dengan ID " + idBuku + " tidak ditemukan!");
            }
            return;
        }
        if (buku.isDipinjam()) {
            System.out.println("Buku dengan ID " + idBuku + " tidak tersedia untuk dipinjam!");
            return;
        }

        buku.pinjamBuku();
        Date tanggalPinjam = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggalPinjam);
        cal.add(Calendar.DATE, 7); // tanggal kembali 1 minggu kemudian
        Date tanggalKembali = cal.getTime();
        String idTransaksi = "T" + (jumlahTransaksi + 1);
        TransaksiPeminjaman transaksi = new TransaksiPeminjaman(idTransaksi, anggota, buku, tanggalPinjam, tanggalKembali);
        
            LIST_TRANSAKSI[jumlahTransaksi] = transaksi;
            jumlahTransaksi++;
            System.out.println("Transaksi dengan ID " + idTransaksi + " berhasil dibuat!");
        } else {
            System.out.println("Daftar transaksi sudah penuh!");
        }
    }

    // Memproses pengembalian buku
    public static void kembalikanBuku(String idTransaksi) {
        TransaksiPeminjaman transaksiFound = null;
        for (int i = 0; i < jumlahTransaksi; i++) {
            if (LIST_TRANSAKSI[i].getIdTransaksi().equals(idTransaksi)) {
                transaksiFound = LIST_TRANSAKSI[i];
                break;
            }
        }
        if (transaksiFound == null) {
            System.out.println("Transaksi dengan ID " + idTransaksi + " tidak ditemukan!");
            return;
        }
        if (transaksiFound.isSelesai()) {
            System.out.println("Buku sudah dikembalikan!");
            return;
        }
        // Proses pengembalian
        transaksiFound.getBuku().kembalikanBuku();
        transaksiFound.setSelesai(true);
        System.out.println("Transaksi buku dengan ID " + idTransaksi + " berhasil dikembalikan!");
    }

    // Menampilkan daftar buku
    public static void tampilkanSemuaBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            LIST_BUKU[i].tampilInfoBuku();
        }
    }

    // Menampilkan daftar anggota
    public static void tampilkanSemuaAnggota() {
        System.out.println("Daftar Anggota:");
        for (int i = 0; i < jumlahAnggota; i++) {
            LIST_ANGGOTA[i].tampilInfoAnggota();
        }
    }

    // Menampilkan daftar transaksi
    public static void tampilkanSemuaTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < jumlahTransaksi; i++) {
            LIST_TRANSAKSI[i].tampilInfoTransaksi();
        }
    }
}