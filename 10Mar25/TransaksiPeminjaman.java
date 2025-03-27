import java.util.Date;

public class TransaksiPeminjaman {
    private final String ID_TRANSAKSI;
    private Anggota anggota;
    private Buku buku;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private boolean isSelesai;
    private static int jumlahTransaksi = 0;

    public TransaksiPeminjaman(String idTransaksi, Anggota anggota, Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        this.ID_TRANSAKSI = idTransaksi;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.isSelesai = false;
        jumlahTransaksi++;
    }

    public String getIdTransaksi() {
        return ID_TRANSAKSI;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public boolean isSelesai() {
        return isSelesai;
    }

    public void setSelesai(boolean selesai) {
        isSelesai = selesai;
    }

    public void tampilInfoTransaksi() {
        String status = isSelesai ? "Selesai" : "Belum Selesai";
        System.out.println("ID: " + ID_TRANSAKSI + ", Status: " + status);
    }
}