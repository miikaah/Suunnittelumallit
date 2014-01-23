
package composite;

public abstract class TietokoneFactory {
    public abstract Laiteosa createEmolevy();
    public abstract Laiteosa createProsessori();
    public abstract Laiteosa createKotelo();
    public abstract Laiteosa createMuistipiiri();
    public abstract Laiteosa createVerkkokortti();
    public abstract Laiteosa createNaytonohjain();
}
