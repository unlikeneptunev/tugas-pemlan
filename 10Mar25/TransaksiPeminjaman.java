public class TransaksiPeminjaman {
    private final String ID_TRANSAKSI;
    private Anggota anggota;
    private Buku buku;
    private boolean isSelesai;
    private static int jumlahTransaksi = 0;

    public TransaksiPeminjaman(String idTransaksi, Anggota anggota, Buku buku) {
        this.ID_TRANSAKSI = idTransaksi;
        this.anggota = anggota;
        this.buku = buku;
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
