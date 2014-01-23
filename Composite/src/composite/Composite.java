
package composite;

public class Composite {

    public static void main(String[] args) {
        /*
        * Testataan aluksi Compositen toimintaa ilman tehdasluokkia
        * laittamalla kaikki laiteosat ensin Emolevyn sisään ja lopuksi
        * laittamalla Emolevy Kotelon sisään
        */
        
        Laiteosa kaikkiLaiteosat = new Kotelo(90);
        Laiteosa emolevy = new Emolevy(100);
        emolevy.addLaiteosa(new Prosessori(150.50));
        emolevy.addLaiteosa(new Muistipiiri(25.75));
        emolevy.addLaiteosa(new Muistipiiri(25.75));
        emolevy.addLaiteosa(new Verkkokortti(20));
        emolevy.addLaiteosa(new Naytonohjain(199.90));
        kaikkiLaiteosat.addLaiteosa(emolevy);
        System.out.println("Kokoonpanon hinta: " + kaikkiLaiteosat.getHinta() + " €");
        
        /*
        * Tehdään sama kuin edellä, mutta käyttäen tehdasta
        * komponenttien luomiseen
        */
        TietokoneFactory tietokoneTehdas = new VerkkokauppaFactory();
        Laiteosa tehdaskokoonpano = tietokoneTehdas.createKotelo();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createEmolevy());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createProsessori());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createVerkkokortti());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createNaytonohjain());
        System.out.println("Verkkokauppakokoonpanon hinta: " + tehdaskokoonpano.getHinta() + " €");
        
        /*
        * Sama kuin edellä, mutta vaihdetaan tehdasta
        */
        tietokoneTehdas = new JimmsFactory();
        tehdaskokoonpano = tietokoneTehdas.createKotelo();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createEmolevy());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createProsessori());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createVerkkokortti());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createNaytonohjain());
        System.out.println("Jimmskokoonpanon hinta: " + tehdaskokoonpano.getHinta() + " €");
    }
    
}
