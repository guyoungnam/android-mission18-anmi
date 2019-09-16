package com.example.doitmission_18;

public class ImageInfo {

    String path;
    String dispalyname;
    String dateAdded;

    public ImageInfo(String path, String dispalyname, String dateAdded) {
        this.path = path;
        this.dispalyname = dispalyname;
        this.dateAdded = dateAdded;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDispalyname() {
        return dispalyname;
    }

    public void setDispalyname(String dispalyname) {
        this.dispalyname = dispalyname;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "ImageInfo{" +
                "path='" + path + '\'' +
                ", dispalyname='" + dispalyname + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                '}';
    }
}
