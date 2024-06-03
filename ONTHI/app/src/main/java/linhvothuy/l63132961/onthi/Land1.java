package linhvothuy.l63132961.onthi;

public class Land1 {
    private String Imageland;
    private String captionland;

    public Land1(String imageland, String captionland) {
        Imageland = imageland;
        this.captionland = captionland;
    }

    public String getImageland() {
        return Imageland;
    }

    public void setImageland(String imageland) {
        Imageland = imageland;
    }

    public String getCaptionland() {
        return captionland;
    }

    public void setCaptionland(String captionland) {
        this.captionland = captionland;
    }
}
