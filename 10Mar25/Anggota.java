public class Anggota {
    private final String ID_ANGGOTA;
    private String nama;
    private String email;
    private static int jumlahAnggota = 0;

    public Anggota(String idAnggota, String nama, String email) {
        this.ID_ANGGOTA = idAnggota;
        this.nama = nama;
        this.email = email;
        jumlahAnggota++;
        System.out.println("Anggota dengan ID " + idAnggota + " berhasil dibuat!");
    }

    public String getIdAnggota() {
        return ID_ANGGOTA;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void tampilInfoAnggota() {
        System.out.println("ID: " + ID_ANGGOTA + ", Nama: " + nama);
    }
}