public class FabriqueEquipementLuxe implements FabriqueEquipement {

    @Override
    public Arme creerArme() {
        return new Baton();
    }

    @Override
    public Costume creerCostume() {
        return new Uniforme();
    }

    @Override
    public Sac creerSac() {
        return new SacADos();
    }

}
