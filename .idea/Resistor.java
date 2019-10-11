public class Resistor extends HardwareComponent
{

private float resistorValue;

public Resistor ( String id, float price, float resistorValue )
{
        super( id, price );
        this.resistorValue = resistorValue;
}

public float getValue ( )
{
        return this.resistorValue;
}

public void setValue ( float resistorValue )
{
        this.resistorValue = resistorValue;
}
}
