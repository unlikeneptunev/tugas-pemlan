public class Buku {
    private final String ID_BUKU;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean isDipinjam;
    private static int jumlahBuku = 0;

    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.ID_BUKU = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = false;
        jumlahBuku++;
        System.out.println("Buku dengan ID " + idBuku + " berhasil dibuat!");
    }

    public String getIdBuku() {
        return ID_BUKU;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public boolean isDipinjam() {
        return isDipinjam;
    }

    public void pinjamBuku() {
        this.isDipinjam = true;
    }

    public void kembalikanBuku() {
        this.isDipinjam = false;
    }

    public void tampilInfoBuku() {
        String status = isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("ID: " + ID_BUKU + ", Judul: " + judul + ", Status: " + status);
    }
}