
package pkgabstract.factory;

public class BossFactory extends VaateFactory {

    @Override
    public Farkut createFarkut() {
        return new BossFarkut();
    }

    @Override
    public Tpaita createTpaita() {
        return new BossTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new BossLippis();
    }

    @Override
    public Kengat createKengat() {
        return new BossKengat();
    }
    
}
