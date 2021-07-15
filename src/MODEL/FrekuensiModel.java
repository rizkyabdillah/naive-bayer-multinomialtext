package MODEL;

public class FrekuensiModel {
    
    private String kata = "";
    private double depresi, sedih, sensitif, lelah;
    private double prob_depresi, prob_sedih, prob_sensitif, prob_lelah;

    public FrekuensiModel() {
    }

    public FrekuensiModel(String kata, double depresi, double sedih, double sensitif, double lelah) {
        this.kata = kata;
        this.depresi = depresi;
        this.sedih = sedih;
        this.sensitif = sensitif;
        this.lelah = lelah;
    }

    public FrekuensiModel(String kata, double depresi, double sedih, double sensitif, double lelah, double prob_depresi, double prob_sedih, double prob_sensitif, double prob_lelah) {
        this.kata = kata;
        this.depresi = depresi;
        this.sedih = sedih;
        this.sensitif = sensitif;
        this.lelah = lelah;
        this.prob_depresi = prob_depresi;
        this.prob_sedih = prob_sedih;
        this.prob_sensitif = prob_sensitif;
        this.prob_lelah = prob_lelah;
    }

    public double getProb_depresi() {
        return prob_depresi;
    }

    public void setProb_depresi(double prob_depresi) {
        this.prob_depresi = prob_depresi;
    }

    public double getProb_sedih() {
        return prob_sedih;
    }

    public void setProb_sedih(double prob_sedih) {
        this.prob_sedih = prob_sedih;
    }

    public double getProb_sensitif() {
        return prob_sensitif;
    }

    public void setProb_sensitif(double prob_sensitif) {
        this.prob_sensitif = prob_sensitif;
    }

    public double getProb_lelah() {
        return prob_lelah;
    }

    public void setProb_lelah(double prob_lelah) {
        this.prob_lelah = prob_lelah;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public double getDepresi() {
        return depresi;
    }

    public void setDepresi(double depresi) {
        this.depresi = depresi;
    }

    public double getSedih() {
        return sedih;
    }

    public void setSedih(double sedih) {
        this.sedih = sedih;
    }

    public double getSensitif() {
        return sensitif;
    }

    public void setSensitif(double sensitif) {
        this.sensitif = sensitif;
    }

    public double getLelah() {
        return lelah;
    }

    public void setLelah(double lelah) {
        this.lelah = lelah;
    }
    
    
    
}
