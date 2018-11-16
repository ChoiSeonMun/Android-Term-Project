package kr.ac.koreatech.cultureman.musicallife;

import android.graphics.drawable.Drawable;

public class FeederListViewItem {

    private Drawable musicalImage ;
    private String musicalTitle ;
    private String musicalPlace;
    private String musicalDate ;

    public void setImage(Drawable icon) {
        musicalImage = icon ;
    }
    public void setTitle(String title) {
        musicalTitle = title ;
    }
    public void setPlace(String place) { musicalPlace = place ; }
    public void setDate(String date) {
        musicalDate = date ;
    }

    public Drawable getImage() {
        return this.musicalImage ;
    }
    public String getTitle() {
        return this.musicalTitle ;
    }
    public String getPlace() { return this.musicalPlace ; }
    public String getDate() {
        return this.musicalDate ;
    }

}
