/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmccune
 */
public class NBAPlayer {
    private String firstName;
    private String lastName;
    private int points;

    public NBAPlayer(){
        
    }
    
    public void displayPlayer(){
        System.out.println("First Name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Total Points = " + points);
        System.out.println("----------------------------\n");
        
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
}