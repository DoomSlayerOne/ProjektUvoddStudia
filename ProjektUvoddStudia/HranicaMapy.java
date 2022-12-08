public class HranicaMapy {

    private Pacman pacman = new Pacman();
    
    private Textura hornyOkraj;
    private Textura dolnyOkraj;
    private Textura pravyOkraj;
    private Textura lavyOkraj;

    public HranicaMapy() {

    this.hornyOkraj = new Textura(800, 20, 0, 0, "blue");
    this.dolnyOkraj = new Textura(800, 20, 0, 580, "blue");
    this.pravyOkraj = new Textura(20, 600, 780, 0, "blue");
    this.lavyOkraj = new Textura(20, 600, 0, 0, "blue");


    }
}