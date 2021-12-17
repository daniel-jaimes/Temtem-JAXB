package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ActionsReader {
    private BufferedReader actionReader;
    public ActionsReader(){
        System.out.println("LEIEDO DATOS...");
        try {
            actionReader = new BufferedReader(new FileReader("files/acciones.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public String readLine(){
        try {
            return actionReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public void close(){
        try {
            actionReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
