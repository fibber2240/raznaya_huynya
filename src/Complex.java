public class Complex {

    double real;
    double image;

    public void add(Complex num) {
        this.real = this.real + num.real;
        this.image = this.image + num.image;
    }

    public void subtract(Complex num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
    }
}

class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        this.speed += 5;
    }

    void brake() {
        if (this.speed >= 5){
            this.speed -= 5;
        }else {
            this.speed = 0;
        }
    }
}
