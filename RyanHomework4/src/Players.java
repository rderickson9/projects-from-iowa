import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ben
 */
public class Players {

    //public static final String fileLoc = "C:\\Users\\Ben\\Documents\\teaching\\NBA.txt";
    public static final String FILELOC = "/Users/rderickson9/Desktop/CS2/NBA.txt";
    public static NBAPlayer[] players;
    public static final int DEFAULT_ARRAY_SIZE = 465;

    public static final int NAME_INDEX = 0;
    public static final int PTS_INDEX = 19;
    
    public static String OUTPUT_FILE_LOCATION = "/Users/rderickson9/Desktop/CS2/output.txt"; 
    
    public static void main(String[] args) {

        try {
            String[] playerFileStringArray = importPlayerFile();
            //displayFields(playerFileStringArray);
            constructPlayers(playerFileStringArray);
            displayPlayers();
            //displayPlayers("michael");
            //displayPlayers("lebron");
            //displayPlayersByLastName("carter-williams");
            //searchPlayers("hard");
            //System.out.println(players.length);
            /*Leaderboard scoringLeaders = new Leaderboard(10);
            scoringLeaders.add(players);
            NBAPlayer me = new NBAPlayer();
            me.setFirstName("Benton");
            me.setLastName("McCune");
            me.setPoints(2000);
            scoringLeaders.displayLeaders();
            scoringLeaders.add(me);
            scoringLeaders.displayLeaders();
            scoringLeaders.remove(0);
            scoringLeaders.displayLeaders();
            */
              players = Arrays.copyOf(players, 5);
              displayPlayers();
              //insertionSortByPts(players);
              System.out.println("\n*****************\n");
              displayPlayers();
              //writePlayersToFile(players);

            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ImportPlayers.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("file not found exception = " + ex);
        }
        
        importPlayerFileTwo();
        
    }

    public static String[] importPlayerFile() throws FileNotFoundException {
        File playerFile = new File(FILELOC);
        Scanner sc = new Scanner(playerFile);
        int index = 0;
        String[] fileStringArray = new String[DEFAULT_ARRAY_SIZE];
        while (sc.hasNextLine() && index < DEFAULT_ARRAY_SIZE) {
            String line = sc.nextLine();
            fileStringArray[index] = line;
            index++;
        }
        
        return fileStringArray;
    }

     public static String[] importPlayerFileTwo(){
        try {
            File playerFile = new File(FILELOC);
            Scanner sc = new Scanner(playerFile);
            int index = 0;
            String[] fileStringArray = new String[DEFAULT_ARRAY_SIZE];
            while (sc.hasNextLine() && index < DEFAULT_ARRAY_SIZE) {
                String line = sc.nextLine();
                fileStringArray[index] = line;
                index++;
            }
            
            return fileStringArray;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Players.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
       
    }
    
    
    //Assumes the first string is player headings
    public static void displayFields(String[] sArray) {
        String headingsString = sArray[0];  // the first row
        String[] headingsArray = headingsString.split("\\s+");
        System.out.println("Index      Field");
        for (int i = 0; i < headingsArray.length; i++) {
            System.out.println(i + "        " + headingsArray[i]);
        }
    }

    //Assumes the first string is player headings
    public static void constructPlayers(String[] playerFileStringArray) {
        players = new NBAPlayer[playerFileStringArray.length - 1];

        for (int i = 1; i < playerFileStringArray.length; i++) {
            NBAPlayer player;
            String playerString = playerFileStringArray[i];
            String[] playerStringArray;
            if (playerString != null) {
                playerStringArray = playerString.split("\\s+");

                String[] playerName = playerStringArray[NAME_INDEX].split(",");

                if (playerName.length == 2) {
                    player = new NBAPlayer();
                    player.setFirstName(playerName[1]);
                    player.setLastName(playerName[0]);
                    player.setPoints(Integer.parseInt(playerStringArray[PTS_INDEX]));
                    players[i - 1] = player;
                    //System.out.println(playerStringArray[NAME_INDEX] + ", " + playerStringArray[PTS_INDEX]);
                }
            } else {
                System.err.println("Null player at index " + i);
            }
        }
    }

    public static void displayPlayers() {
        int i = 0;
        for (NBAPlayer player : players) {
            if (player != null) {
                player.displayPlayer();
            } else {
                System.out.println("null player at index = " + i);
            }
            i++;
        }
    }

    public static void displayPlayers(String firstName) {
        for (NBAPlayer player : players) {
            if (player != null && player.getFirstName().equals(firstName)) {
                player.displayPlayer();
            }
        }
    }

    public static void searchPlayers(String key) {
        for (NBAPlayer player : players) {
            if (player != null && (player.getFirstName() + player.getLastName()).contains(key)) {
                player.displayPlayer();
            }
        }
    }

    public static void displayPlayersByLastName(String lastName) {
        for (NBAPlayer player : players) {
            if (player != null && player.getLastName().equals(lastName)) {
                player.displayPlayer();
            }
        }
    }

    public static void writePlayersToFile(NBAPlayer[] playArray){
        try {
            PrintWriter pw = new PrintWriter(OUTPUT_FILE_LOCATION);
            pw.println("Last Name, First Name, Points");
            
            for (NBAPlayer player:playArray){
                String pString = player.getLastName()+","+player.getFirstName()+","+player.getPoints();                
                pw.println(pString);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("writePlayersToFile exception = " + ex);
        }
    }
    
    public static void insertionSortByPts(NBAPlayer[] players) {
        int size = players.length;
        for (int k = 1; k < size; k++) {
            NBAPlayer cur = players[k];
            int j = k;
            while (j > 0 && players[j - 1].getPoints() > cur.getPoints()) {
                players[j] = players[j - 1];
                j--;
            }
            players[j] = cur;
        }
    }
    
    
}