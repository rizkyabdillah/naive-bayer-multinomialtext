package MODEL;

public class DiprediksiModel {
    
    public static int INDEX_DEPRESI = 0;
    public static int INDEX_SEDIH = 1;
    public static int INDEX_SENSITIF = 2;
    public static int INDEX_LELAH = 3;
    
    private String kalimat;
    private int index;

    public DiprediksiModel(String kalimat, int index) {
        this.kalimat = kalimat;
        this.index = index;
    }

    public String getKalimat() {
        return kalimat;
    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
