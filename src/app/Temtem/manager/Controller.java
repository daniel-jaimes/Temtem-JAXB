package manager;

import model.Player;

import java.util.ArrayList;

public class Controller {
    private static Controller controller;

    public static Controller getInstance() {
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    private Controller(){
    }
    public void init() {
        ArrayList<Player> players = readPlayers();
    }

    private ArrayList<Player> readPlayers() {
        return null;
    }
}
