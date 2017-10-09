package com.Dhanushka.remindme;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Book extends RealmObject {

    @PrimaryKey
    private int id;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private int hour;
    private int min;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
