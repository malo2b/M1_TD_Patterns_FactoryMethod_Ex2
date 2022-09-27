public class SimulateurTroll extends Simulateur {

    public SimulateurTroll(String nom) {
        super(new Troll(nom, new FabriqueEquipementBase()));
    }
}
