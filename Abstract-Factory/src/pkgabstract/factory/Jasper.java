
package pkgabstract.factory;

public class Jasper {
    private Farkut farkut;
    private Kengat kengat;
    private Lippis lippis;
    private Tpaita tpaita;
    
    public Jasper(VaateFactory vaateTehdas) {
        farkut = vaateTehdas.createFarkut();
        kengat = vaateTehdas.createKengat();
        lippis = vaateTehdas.createLippis();
        tpaita = vaateTehdas.createTpaita();
    }
    
    @Override
    public String toString() {
        String tulostus = "Päälläni on: \n";
        
        tulostus += farkut + "\n";
        tulostus += kengat + "\n";
        tulostus += lippis + "\n";
        tulostus += tpaita + "\n";
        
        return tulostus;
    }
}
