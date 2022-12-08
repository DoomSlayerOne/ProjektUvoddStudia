
public class Game {

    private Manazer manazer;

    private HranicaMapy hranicaMapy;
    private Pacman pacman;
    private Duch duch;
    

    public Game() {
        
        this.hranicaMapy = new HranicaMapy();
        this.pacman = new Pacman();
        
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }


    // Stlac Esc pre ukoncenie hry
    public void zrus() {
        System.exit(0);
    }
}