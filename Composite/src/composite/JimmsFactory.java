
package composite;

public class JimmsFactory implements TietokoneFactory {

    @Override
    public LaiteosaComposite createEmolevy() {
        return new Emolevy(120.20);
    }

    @Override
    public Laiteosa createProsessori() {
        return new Prosessori(175.50);
    }

    @Override
    public LaiteosaComposite createKotelo() {
        return new Kotelo(120);
    }

    @Override
    public Laiteosa createMuistipiiri() {
        return new Muistipiiri(20.50);
    }

    @Override
    public Laiteosa createVerkkokortti() {
        return new Verkkokortti(15.75);
    }

    @Override
    public Laiteosa createNaytonohjain() {
        return new Naytonohjain(210.10);
    }
    
}
