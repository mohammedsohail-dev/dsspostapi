package com.skiers.project.models;
//import java.util.ArrayList;
import jakarta.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="LiftRides")
public class LiftRide {
    @Id
    Integer resortID;
    String seasonID;
    String dayID;
    Integer skierID;
    Integer time;
    Integer LiftID;

    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getLiftID() {
        return this.LiftID;
    }

    public void setLiftID(Integer LiftID) {
        this.LiftID = LiftID;
    }
    

    public Integer getResortID() {
        return this.resortID;
    }

    public void setResortID(Integer resortID) {
        this.resortID = resortID;
    }

    public String getSeasonID() {
        return this.seasonID;
    }

    public void setSeasonID(String seasonID) {
        this.seasonID = seasonID;
    }

    public String getDayID() {
        return this.dayID;
    }

    public void setDayID(String dayID) {
        this.dayID = dayID;
    }

    public Integer getSkierID() {
        return this.skierID;
    }

    public void setSkierID(Integer skierID) {
        this.skierID = skierID;
    }



    
    

   

   
    
}





