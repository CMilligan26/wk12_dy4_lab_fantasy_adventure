public class Apparel extends Content implements IWearable {

    private int additionalHP;

    public Apparel(String name, int additionalHP) {
        super(name);
        this.additionalHP = additionalHP;
    }

}
