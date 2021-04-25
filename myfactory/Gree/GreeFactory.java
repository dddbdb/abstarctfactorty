public class GreeFactory implements myFactory{
    @Override
    public Television produceTelevision() {
        return new GreeTelevision();
    }

    @Override
    public AirConditioner produceAirCondition() {
        return new GreeAirConditioner();
    }
}
