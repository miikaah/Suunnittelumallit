
package pkgabstract.factory;

public class AdidasFactory implements VaateFactory{

    @Override
    public Farkut createFarkut() {
        return new AdidasFarkut();
    }

    @Override
    public Tpaita createTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new AdidasLippis();
    }

    @Override
    public Kengat createKengat() {
        return new AdidasKengat();
    }
    
}
