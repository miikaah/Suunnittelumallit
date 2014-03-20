
package builder;

/**
 *
 * @author miikaah
 */
public class Director {

    public static void main(String[] args) {
        Hamburger hamburger = new SugarNShitBuilder().getResult();
        System.out.println(hamburger);
        hamburger = new KaikillaMausteillaBuilder().getResult();
        System.out.println(hamburger);
    }
    
}
