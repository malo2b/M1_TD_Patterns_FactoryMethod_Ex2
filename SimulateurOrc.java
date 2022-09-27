public class SimulateurOrc extends Simulateur {

    public SimulateurOrc(String nom) {
        super(new Orc(nom, new FabriqueEquipementBase()));
    }
}
