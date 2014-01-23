package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}
