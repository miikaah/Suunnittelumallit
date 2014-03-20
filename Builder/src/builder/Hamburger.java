package builder;

/**
 *
 * @author miikaah
 */
public class Hamburger {

    private boolean hasKetchup;
    private boolean hasMustard;
    private boolean hasCheese;
    private boolean hasOnions;
    private boolean hasMayonayse;
    private int noPatties;
    private String brand;

    public void setHasKetchup(boolean hasKetchup) {
        this.hasKetchup = hasKetchup;
    }

    public void setHasMustard(boolean hasMustard) {
        this.hasMustard = hasMustard;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public void setHasOnions(boolean hasOnions) {
        this.hasOnions = hasOnions;
    }

    public void setHasMayonayse(boolean hasMayonayse) {
        this.hasMayonayse = hasMayonayse;
    }

    public void setNoPatties(int noPatties) {
        this.noPatties = noPatties;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        String output = "";
        if (!brand.isEmpty()) {
            output += brand + " hamburger with: ";
            if (hasKetchup) {
                output += " ketchup, ";
            }
            if (hasCheese) {
                output += " cheese, ";
            }
            if (hasMayonayse) {
                output += " mayonayse, ";
            }
            if (hasMustard) {
                output += " mustard, ";
            }
            if (hasOnions) {
                output += " onions, ";
            }
            output = output.substring(0, output.length() - 1);
            if (noPatties <= 1) {
                output += " and " + noPatties + " patty.";
            } else {
                output += " and " + noPatties + " patties.";
            }            
        } else {
            return null;
        }

        return output;
    }
}
