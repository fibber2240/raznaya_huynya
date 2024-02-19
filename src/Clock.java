public class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes >= 0 & this.minutes <= 59) {
            this.minutes += 1;
            if (this.minutes == 59 & this.hours > 0 & this.hours < 12) {
                this.minutes = 0;
                this.hours += 1;
            } else {
                this.hours = 1;
            }
        }
    }
}

