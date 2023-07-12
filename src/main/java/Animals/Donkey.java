package Animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Donkey extends Pack{
    protected String name;
    protected HashMap<String, String> command = new HashMap<>();
    protected String bithdaye;

    public Donkey(int animalID, String name, String bithdaye) {
        super(animalID);
        this.name = name;
        this.bithdaye = bithdaye;
    }

    public String getName() {
        return name;
    }
    public void newCommand(String command, String action){
        this.command.put(command, action);
    }

    public String getCommand(String command){
        return this.command.get(command);
    }

    public void listCommand(){
        ArrayList<String> commands = new ArrayList<>(this.command.keySet());
        System.out.println(Arrays.toString(new ArrayList[]{commands}));
    }


    @Override
    public String toString() {
        return String.format(getAnimalID() + " " + name + " " + type + " Осел " + bithdaye);
    }
}
