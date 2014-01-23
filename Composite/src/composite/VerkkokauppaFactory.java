
package composite;

public class VerkkokauppaFactory extends TietokoneFactory {

    @Override
    public Laiteosa createEmolevy() {
        return new VerkkokauppaEmolevy();
    }

    @Override
    public Laiteosa createProsessori() {
        return new VerkkokauppaProsessori();
    }

    @Override
    public Laiteosa createKotelo() {
        return new VerkkokauppaKotelo();
    }

    @Override
    public Laiteosa createMuistipiiri() {
        return new VerkkokauppaMuistipiiri();
    }

    @Override
    public Laiteosa createVerkkokortti() {
        return new VerkkokauppaVerkkokortti();
    }

    @Override
    public Laiteosa createNaytonohjain() {
        return new VerkkokauppaNaytonohjain();
    }

}
