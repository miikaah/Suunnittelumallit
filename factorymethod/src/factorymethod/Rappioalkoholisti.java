
package factorymethod;

public class Rappioalkoholisti extends AterioivaOtus {
    
    public Juoma createJuoma(){
        return new Kalja();
    };
}
