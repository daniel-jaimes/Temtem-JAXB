package manager;

import Exceptions.LogicException;
import dao.ActionsReader;
import dao.MarshallPlayers;
import dao.UnmarshallXMLInput;
import model.Atribute;
import model.Player;
import model.Temtem;

import java.util.ArrayList;

public class Controller {
    private static Controller controller;
    private ArrayList<Player> players;
    private boolean shutdown;
    public static Controller getInstance() {
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    private Controller(){
    }
    public void init() {
        shutdown = false;
        readPlayers();
        readActions();
        writePlayers();
    }

    private void writePlayers() {
        MarshallPlayers MP = new MarshallPlayers(players);
        MP.init();
    }

    private void readActions() {
        ActionsReader AR = new ActionsReader();
        String cmd;
        while((cmd = AR.readLine()) != null && !shutdown){
            try {
                selectorAction(cmd);
            } catch (LogicException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void selectorAction(String cmd) throws LogicException {
        String[] line = null;
        if(cmd.length() != 1) {
             line = cmd.substring(2).split(" ");
        }
        switch (Character.toUpperCase(cmd.charAt(0))){
            case 'M':
                actionM(line[0]);
                break;
            case 'P':
                actionP(line[0]);
                break;
            case 'B':
                actionB(line);
                break;
            case 'A':
                if(line.length != 9) {
                    throw new LogicException(LogicException.PARAMETERS_NUMBER_INCORRECT);
                }
                actionA(line);
                break;
            case 'S':
                shutdown = true;
                throw new LogicException(LogicException.SHUT_DOWN);
            default:
                break;
        }
    }


    //ACTIONS

    private void actionA(String[] line) throws LogicException {
        Player p = searchPlayerById(line[0]);
        if(p == null) throw new LogicException(LogicException.PLAYER_DONT_STORED);

        Temtem t = new Temtem(line[1], "", "");
        ArrayList<Atribute> attrs = t.getAtributes();
        attrs.add(new Atribute("PS", line[2]));
        attrs.add(new Atribute("ATQ", line[3]));
        attrs.add(new Atribute("SATQ", line[4]));
        attrs.add(new Atribute("STA", line[5]));
        attrs.add(new Atribute("VEL", line[6]));
        attrs.add(new Atribute("DEF", line[7]));
        attrs.add(new Atribute("SDEF", line[8]));

        p.getTemtems().add(t);
    }

    private void actionB(String[] line) throws LogicException {
        Player p = searchPlayerById(line[0]);
        if(p == null) throw new LogicException(LogicException.PLAYER_DONT_STORED);

        Temtem t = searchTemtemById(line[1]);
        if(t == null) throw new LogicException(LogicException.TEMTEM_DONT_STORED);

        deleteTemtemOfOnePlayer(p, t);
    }

    private void deleteTemtemOfOnePlayer(Player p, Temtem t) {
        p.getTemtems().remove(t);
    }

    private void actionP(String id) throws LogicException {
        Player p = searchPlayerById(id);
        if(p == null) throw new LogicException(LogicException.PLAYER_DONT_STORED);
        System.out.println(p);
    }

    private void actionM(String id) throws LogicException {
        Temtem t = searchTemtemById(id);
        if(t == null) throw new LogicException(LogicException.TEMTEM_DONT_STORED);
        System.out.println(t);
    }

    private void readPlayers() {
        UnmarshallXMLInput unmarshaller = new UnmarshallXMLInput();
        this.players =  unmarshaller.getPlayers();
    }

    private Player searchPlayerById(String id) {
        if(players.stream().anyMatch(p -> p.getId().equals(id))){
            return players.stream()
                    .filter(p -> p.getId().equals(id))
                    .findFirst()
                    .get();
        }
        return null;
    }

    private Temtem searchTemtemById(String id){
        for (Player p : players){
            if(p.getTemtems().stream().anyMatch(t -> t.getId().equals(id))){
                return p.getTemtems().stream()
                        .filter(t -> t.getId().equals(id))
                        .findFirst()
                        .get();
            }
        }
        return null;
    }

}
