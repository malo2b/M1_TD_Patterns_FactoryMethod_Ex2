public abstract class Personnage {

    protected String nom;

    protected Arme hArme;
    protected Costume hCostume;
    protected Sac hSac;
    protected FabriqueEquipement equipement;

    public Personnage(String nom, FabriqueEquipement equipement) {
        this.nom = nom;
        this.equipement = equipement;
        setArme(equipement.creerArme());
        setCostume(equipement.creerCostume());
        setSac(equipement.creerSac());
    }

    void animer() {
        System.out.println(
            String.format("Le %s du nom de %s s'anime", getClass().getName(), nom)
        );
    }

    public void setArme(Arme hArme) {
        this.hArme = hArme;
    }

    public void setCostume(Costume hCostume) {
        this.hCostume = hCostume;
    }

    public void setSac(Sac hSac) {
        this.hSac = hSac;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", Arme=" + hArme +
                ", Costume=" + hCostume +
                ", Sac=" + hSac +
                '}';
    }
}
