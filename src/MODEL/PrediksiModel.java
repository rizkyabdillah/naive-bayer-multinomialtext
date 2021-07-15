package MODEL;

public class PrediksiModel {
    
    private String kalimat, diprediksi, prediksi;

    public PrediksiModel(String kalimat, String diprediksi, String prediksi) {
        this.kalimat = kalimat;
        this.diprediksi = diprediksi;
        this.prediksi = prediksi;
    }

    public String getKalimat() {
        return kalimat;
    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    public String getDiprediksi() {
        return diprediksi;
    }

    public void setDiprediksi(String diprediksi) {
        this.diprediksi = diprediksi;
    }

    public String getPrediksi() {
        return prediksi;
    }

    public void setPrediksi(String prediksi) {
        this.prediksi = prediksi;
    }
    
    
    
    
}
