package ge.guka.springbootdemo.naruto.model;

public class Chakra {

    private String nature;
    private int amount;
    private boolean hasSpecialChakra;

    public Chakra(String nature, int amount, boolean hasSpecialChakra){
        this.nature = nature;
        this.amount = amount;
        this.hasSpecialChakra = hasSpecialChakra;
    }

    public String getNature() {
        return nature;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isHasSpecialChakra() {
        return hasSpecialChakra;
    }
}
