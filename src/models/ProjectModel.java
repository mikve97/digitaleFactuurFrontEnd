package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mike van Es
 */
public class ProjectModel {
    /**
     * @author Mike van Es
     * TODO: ADD VEHICLE MODEL, THIS MODEL DID NOT EXIST YET, FIX POSSIBLE POINTER EXCEPTIONS
     */

    private int id;
    private String name;
    private ArrayList<TripModel> tripModel;


    /**
     * @author Mike van Es
     * Contructor function of the project model
     * @param: int id
     * @param: string name
     * @param: Arraylist<TripModel> Trip
     */
    public ProjectModel(int id, String name, ArrayList<TripModel> trip){
        this.id = id;
        this.name = name;
        this.tripModel = trip;
    }

    /**
     * @author Mike van Es
     * Method to change the existing projects name or add a new list of trips
     * @param: int id
     * @param: string name
     * @param: Arraylist<TripModel> Trip
     */
    public void changeProject(int id, String name, ArrayList<TripModel> trip){
        this.name = name;
        this.tripModel = trip;
    }

    /**
     * @author Mike van Es
     * Method to add a single trip to the existing trips
     */
    public void addTrip(TripModel trip){
        this.tripModel.add(trip);
    }


    /**
     * @author Mike van Es
     * Method to get the project name
     * @return: int of the project id
     */
    public int getProjectId(){
        return this.id;
    }


    /**
     * @author Mike van Es
     * Method to get the project name
     * @return: string of the project name
     */
    public String getProjectName(){
        return this.name;
    }


    /**
     * @author Mike van Es
     * Method to get the total riden kilometers of a given project
     * @return: double of all driven kilometers
     */
    public double getTotalKilometers(){
        double totalKilometers = 0;
        for (int i = 0; i < tripModel.size(); i++) {
            totalKilometers = totalKilometers + tripModel.get(i).getEndKilometergauge() - tripModel.get(i).getStartKilometergauge();
        }

        return totalKilometers;
    }

    /**
     * @author Mike van Es
     * Method to get the total amount of trips on a project
     * @return: int of all trips
     */
    public int getTotalTrips(){
        return tripModel.size();
    }




}
