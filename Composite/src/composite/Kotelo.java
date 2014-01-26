
package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements LaiteosaComposite {
    private double hinta;
    private List<Laiteosa> kotelonOsat = new ArrayList<>();
    
    public Kotelo(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        double yhtHinta = this.hinta;
        for (Laiteosa laiteosa : kotelonOsat) {
            yhtHinta += laiteosa.getHinta();
        }
        return yhtHinta;
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        if (!kotelonOsat.contains(osa)) {
            kotelonOsat.add(osa);
        }
    }
}
