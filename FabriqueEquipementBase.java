public class FabriqueEquipementBase implements FabriqueEquipement {


    @Override
    public Arme creerArme() {
        return new Epee();
    }

    @Override
    public Costume creerCostume() {
        return new Robe();
    }

    @Override
    public Sac creerSac() {
        return new Besace();
    }
}
