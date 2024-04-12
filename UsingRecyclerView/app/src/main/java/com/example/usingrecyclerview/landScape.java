package com.example.usingrecyclerview;

public class landScape {
    String landImageFileName;
    String landCaption;

    public landScape(String landImageFileName, String landCaption) {
        this.landImageFileName = landImageFileName;
        this.landCaption = landCaption;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
