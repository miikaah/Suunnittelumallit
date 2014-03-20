
package builder;

/**
 *
 * @author miikaah
 */
public class SugarNShitBuilder extends HamburgerBuilder {

    @Override
    public void setPatties() {
        hamburger.setNoPatties(2);
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
        hamburger.setHasOnions(false);
    }

    @Override
    public void setMayonayse() {
        hamburger.setHasMayonayse(false);
    }

    @Override
    public void setBrand() {
        hamburger.setBrand("Sugar N' Shit!");
    }
    
}
