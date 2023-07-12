package Animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class Animal {
    private int animalID;
    protected HashMap<String, String> command = new HashMap<>();

    protected Animal(int animalID) {
        this.animalID = animalID;
    }

    public int getAnimalID(){
        return animalID;
    }

    public void newCommand(String command, String action){
        this.command.put(command, action);
    }

    public void listCommand(){
        ArrayList<String> commands = new ArrayList<>(this.command.keySet());
        System.out.println(Arrays.toString(new ArrayList[]{commands}));
    }
}
