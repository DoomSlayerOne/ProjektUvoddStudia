import java.util.Random;

public class Duch {

    private Textura duch;
    
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

        this.duch = new Textura(20, 20, randomX, randomY, "white");
        
    }
    
    public void zmenPolohu() {
        Random r = new Random();
        int randomX = 0;
        int randomY = 0;
        do {
        randomX = r.nextInt(760 - 20) + 20; // od 20 po 760 -> x
    } while (randomX %20 != 0);
        do {
        randomY = r.nextInt(560 - 20) + 20; // od 20 po 560 -> y
    } while (randomY %20 != 0);

        this.duch = new Textura(20, 20, randomX, randomY, "white");
        
    }

    public Obdlznik getModel() {
        return this.duch.getModel();
    }
}