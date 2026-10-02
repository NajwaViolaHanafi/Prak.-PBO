public class MotorDemo {
    public static void main(String[] args) {
        Motor18 motor1 = new Motor18();
        motor1.displayStatus();
        motor1.platNomor = "B 0838 XZ";
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor18 motor2 = new Motor18();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor18 motor3 = new Motor18();
        motor3.platNomor = "D 8343 CV";
        motor3.isMesinOn = false;
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}