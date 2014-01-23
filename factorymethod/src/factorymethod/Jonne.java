
package factorymethod;

public class Jonne extends AterioivaOtus{

    @Override
    public Juoma createJuoma() {
        return new ES();
    }
    
}
