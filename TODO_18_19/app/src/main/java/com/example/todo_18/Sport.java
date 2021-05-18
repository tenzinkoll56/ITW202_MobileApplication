package com.example.todo_18;

public class Sport {
    private String title;
    private String info;
    private final int imageResourcce;

    Sport(String title, String info, int imageResourcce){
        this.title = title;
        this.info = info;
        this.imageResourcce = imageResourcce;
    }
    String getTitle(){
        return title;
    }
    String getInfo() {

        return info;
    }
   public int getImageResourcce() {
        return imageResourcce;
   }
}
