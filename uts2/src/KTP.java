public class KTP {
    private String nama;
    private String telefon;
    private String tgl_lhr;

    public void setTgl_lhr(String tgl_lhr) {
        this.tgl_lhr = tgl_lhr;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public KTP(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "KTP{" +
                "nama='" + nama + '\'' +
                '}';
    }
}
