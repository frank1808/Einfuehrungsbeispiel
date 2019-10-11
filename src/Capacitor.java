//import

public class Capacitor extends HardwareComponent
{

private float capacitorValue;

public Capacitor ( String id, float price, float capacitorValue )
{
        super ( id, price );
        this.capacitorValue = capacitorValue;
}

public float getValue ( )
{
        return this.capacitorValue;
}

public void setValue ( float capacitorValue )
{
        this.capacitorValue = capacitorValue;
}
}
