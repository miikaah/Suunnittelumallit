
package builder;

/**
 * Builder interface for building different kinds of Hamburgers
 * @author miikaah
 */
public abstract class HamburgerBuilder {
    protected Hamburger hamburger;
    public Hamburger getResult() {
        hamburger = new Hamburger();
        setBrand();
        setCheese();
        setKetchup();
        setMayonayse();
        setMustard();
        setOnions();
        setPatties();
        return hamburger;
    }
    public abstract void setPatties();
    public abstract void setKetchup();
    public abstract void setMustard();
    public abstract void setCheese();
    public abstract void setOnions();
    public abstract void setMayonayse();
    public abstract void setBrand();
}
