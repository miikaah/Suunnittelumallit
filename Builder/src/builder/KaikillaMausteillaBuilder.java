
package builder;

/**
 *
 * @author miikaah
 */
public class KaikillaMausteillaBuilder extends HamburgerBuilder {

    @Override
    public void setPatties() {
        hamburger.setNoPatties(1);
    }

    @Override
    public void setKetchup() {
        hamburger.setHasKetchup(true);
    }

    @Override
    public void setMustard() {
        hamburger.setHasMustard(true);
    }

    @Override
    public void setCheese() {
        hamburger.setHasCheese(true);
    }

    @Override
    public void setOnions() {
        hamburger.setHasOnions(true);
    }

    @Override
    public void setMayonayse() {
        hamburger.setHasMayonayse(true);
    }

    @Override
    public void setBrand() {
        hamburger.setBrand("Kaikilla Mausteilla Grilli");
    }
    
}
