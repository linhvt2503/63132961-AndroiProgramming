package linhvothuy.l63132961.linhck;

public class Land{
    private String Imageland;
    private String landCap;

    public Land(String imageland, String landCap) {
        Imageland = imageland;
        this.landCap = landCap;
    }

    public String getImageland() {
        return Imageland;
    }

    public void setImageland(String imageland) {
        Imageland = imageland;
    }

    public String getLandCap() {
        return landCap;
    }

    public void setLandCap(String landCap) {
        this.landCap = landCap;
    }
}
