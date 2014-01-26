
package composite;

public interface TietokoneFactory {
    public LaiteosaComposite createEmolevy();
    public Laiteosa createProsessori();
    public LaiteosaComposite createKotelo();
    public Laiteosa createMuistipiiri();
    public Laiteosa createVerkkokortti();
    public Laiteosa createNaytonohjain();
}
