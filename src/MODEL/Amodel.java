package MODEL;

public class Amodel {
    
    private String kalimat, kategori;

    public Amodel(String kalimat, String kategori) {
        this.kalimat = kalimat;
        this.kategori = kategori;
    }

    public String getKalimat() {
        return kalimat;
    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
    
}
