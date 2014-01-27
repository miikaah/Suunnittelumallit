
package observer;

public class Main {
    
    public static void main(String[] args) {
        ClockTimer subjectClock = new ClockTimer(20, 17, 30);
        DigitalClock digitalClock = new DigitalClock(subjectClock);
        while (true){            
        }
    }    
}
