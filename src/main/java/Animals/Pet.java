package Animals;

public class Pet extends Animal{
        protected String type;

        protected Pet(int animalID) {
            super(animalID);
            this.type = "Домашние";
        }

}
