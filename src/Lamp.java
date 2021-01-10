public class Lamp implements ElectricityConsumer{

    public void lightOn(){
        System.out.println("Lamp on");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
