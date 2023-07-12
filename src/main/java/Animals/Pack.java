package Animals;

public class Pack extends Animal{
    protected String type;

    protected Pack(int animalID) {
        super(animalID);
        this.type = "Вьючные";
    }
}
