import java.util.ArrayList;
import java.util.Random;

public class Pacman {

    private Manazer manazer;
    private Textura pacman;

    private ArrayList<Textura> clankyPacmana = new ArrayList<Textura>();
   
    private final int zaciatocnaPoziciaX = 400;
    private final int zaciatocnaPoziciaY = 300;
    private final int velkost = 20;
    private int smerX;
    private int smerY;
    private int skore = 0;
    

    private boolean zije = true;

    private int pocitadloTikov = 0;

    private Duch duch = new Duch();

    public Pacman() {
        this.pacman = new Textura(this.velkost, this.velkost, this.zaciatocnaPoziciaX, this.zaciatocnaPoziciaY, "yellow");
        this.clankyPacmana.add(this.pacman);
        
        this.smerX = 0;
        this.smerY = 0;

        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }

    public boolean koliduje() {
        if (this.pacman.getModel().getLavyHornyX() == this.duch.getModel().getLavyHornyX()
            && this.pacman.getModel().getLavyHornyY() == this.duch.getModel().getLavyHornyY()) {
            this.duch.getModel().skry();
            zvysSkore();
            this.duch.zmenPolohu();
            this.duch.getModel().zobraz();
            
            return true;
        }

        return false;
    }

    public void vytvorDucha() {

        Random r = new Random();
        int randomX = r.nextInt(760 - 20) + 20; // od 20 po 760 -> x
        int randomY = r.nextInt(560 - 20) + 20; // od 20 po 560 -> y

    }

    public void tik() {
        this.pocitadloTikov++;
        int delay = 4;

        if (zije && this.pocitadloTikov >= delay) {
            for (Textura clanokPacman : this.clankyPacmana) {
                clanokPacman.getModel().posunVodorovne(this.smerX * this.velkost);
                clanokPacman.getModel().posunZvisle(this.smerY * this.velkost);
            }
            if (koliduje() == true) {
                for (int i = 0; i < 3; i++) {
                    vytvorDucha();
                
                }
                
            }

            if (this.pacman.getModel().getLavyHornyX() + this.velkost >= 800 || this.pacman.getModel().getLavyHornyX() <= 0
                    || this.pacman.getModel().getLavyHornyY() + this.velkost >= 600 || this.pacman.getModel().getLavyHornyY() <= 0) {
                this.zije = false;
                System.out.println("Tvoje skore je: " + getSkore());
                respawnuj();
                System.out.println("Koniec hry! \n-->Stlac enter alebo space ak to chces skusit znova. \n--> Stlac Esc ked chces ukoncit hru." +
                        "\n______________________");
            }

            this.pocitadloTikov = 0;
        }
    }

    public void aktivuj() {
        this.zije = true;
    }

    // resetuje poziciu pacmana aj pohyb
    public void respawnuj() {
        this.pacman.getModel().setLavyHornyX(this.zaciatocnaPoziciaX);
        this.pacman.getModel().setLavyHornyY(this.zaciatocnaPoziciaY);
        this.smerX = 0;
        this.smerY = 0;
        this.nulujSkore();
    }

    public void posunVpravo() {
        
            this.smerX = 1;
            this.smerY = 0;
        
    }

    public void posunVlavo() {
        
            this.smerX = -1;
            this.smerY = 0;
        
    }

    public void posunHore() {
        
            this.smerX = 0;
            this.smerY = -1;
        
    }

    public void posunDole() {
        
            this.smerX = 0;
            this.smerY = 1;
        
    }
    
    public void zvysSkore() {
        this.skore++;
    }
    
    public void nulujSkore() {
        this.skore = 0;
    }
    
    public int getSkore() {
        if (this.skore >= 1) {
            return skore + 1;
        } else 
        return skore;
    } 

    public int getVelkost() {
        return this.velkost;
    }
}