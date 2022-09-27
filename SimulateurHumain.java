public class SimulateurHumain extends Simulateur {

    public SimulateurHumain(String nom) {
        super(new Humain(nom, new FabriqueEquipementLuxe()));
    }

}
