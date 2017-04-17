package com.ifutama.maryanaindah.recyclerview.model;

/**
 * Java Representasion of our Data. to be displayed in the RecyclerView
 * Created by indah on 4/16/2017.
 */

public class ListItem {
    private String title;
    private String subTitle;
    private int imageResid;
    private boolean favourite = false;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResid(){
        return imageResid;
    }

    public void setImageResid(int imageResid) {
        this.imageResid = imageResid;
    }
}
