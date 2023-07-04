package Practice.Convert;

public class Kelvin implements Converter {

    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }

}
