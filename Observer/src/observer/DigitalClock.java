
package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer subject;

    public DigitalClock(ClockTimer subjectClock) {
        subject = subjectClock;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (subject == o) {
            formatTime();
        }
    }
    
    private void formatTime() {        
        int hour = subject.getHour();
        int min = subject.getMinute();
        int sec = subject.getSecond();
        String printOut = "";
        
        if (hour < 10) {
            printOut += "0" + hour + ":";
        } else {
            printOut += "" + hour + ":";
        }
        if (min < 10) {
            printOut += "0" + min + ":";
        } else {
            printOut += "" + min + ":";
        }
        if (sec < 10) {
            printOut += "0" + sec;
        } else {
            printOut += "" + sec;
        }        
        System.out.println(printOut);
    }
}
