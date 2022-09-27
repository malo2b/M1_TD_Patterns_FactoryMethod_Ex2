public class main {

    public static void main(String[] args) {
        Simulateur hSimulateur = new SimulateurTroll("Trolito");
        System.out.println(hSimulateur);
        hSimulateur.simuler();

        Simulateur iSimulateur = new SimulateurHumain("Bengous");
        System.out.println(iSimulateur);
        iSimulateur.simuler();

    }

}
