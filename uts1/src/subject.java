class subject {
    int beban;
    String nama;

    public subject(int beban, String nama) {
        this.beban = beban;
        this.nama = nama;
    }

    public int getBeban() {
        return beban;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "subject{" +
                "beban=" + getBeban() +
                ", nama='" + getNama() + '\'' +
                '}';
    }
}