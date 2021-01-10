public class Switcher {

    public ElectricityConsumer consumer;

    public void switchOn() {
        System.out.println("On");
        if(consumer != null) {
            consumer.electricityOn();
        }
    }
}
