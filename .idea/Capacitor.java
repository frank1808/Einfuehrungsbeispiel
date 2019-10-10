//import

public class Capacitor extends HardwareComponent
{
private float capacitorValue;

public Capacitor ( float capacitorValue )
{
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
