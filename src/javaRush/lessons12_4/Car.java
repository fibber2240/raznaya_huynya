package javaRush.lessons12_4;

public class Car {
    Engine engine = new Engine();

    class Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
    }
}
