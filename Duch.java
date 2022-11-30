import java.util.Random;
/**
 * Write a description of class Duch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duch {
    /**
     * Constructor for objects of class Duch
     */
    private ObrazkovyModel duch;
    public Duch() {
        Random r = new Random();
        int randomX = 0;
        int randomY = 0;
        do {
        randomX = r.nextInt(760 - 20) + 20; // od 20 po 760 -> x
    } while (randomX %20 != 0);
        do {
        randomY = r.nextInt(560 - 20) + 20; // od 20 po 560 -> y
    } while (randomY %20 != 0);

        this.duch = new ObrazkovyModel(randomX, randomY, "ghost.png");

    }
    
    public Obrazok getModel() {
        return this.duch.getModel();
    }
}
