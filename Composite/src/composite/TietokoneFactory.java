
package composite;

public interface TietokoneFactory {
    public Laiteosa createEmolevy();
    public Laiteosa createProsessori();
    public Laiteosa createKotelo();
    public Laiteosa createMuistipiiri();
    public Laiteosa createVerkkokortti();
    public Laiteosa createNaytonohjain();
}
