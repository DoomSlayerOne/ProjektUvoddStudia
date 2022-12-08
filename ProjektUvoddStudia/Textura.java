public class Textura {

    private Obdlznik model;

    public Textura(int stranaA, int stranaB, int x, int y, String farba) {
        this.model = new Obdlznik();
        this.model.zmenFarbu(farba);
        this.model.zmenStrany(stranaA, stranaB);
        this.model.posunVodorovne(-60 + x);
        this.model.posunZvisle(- 50 + y);
        this.model.zobraz();
    }

    public Obdlznik getModel() {
        return this.model;
    }
}