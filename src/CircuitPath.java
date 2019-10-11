import java.util.ArrayList;
import java.util.Collection;

public class CircuitPath
{

private HardwareComponent hwComponent1, hwComponent2;

public CircuitPath ( HardwareComponent hwComponent1, HardwareComponent hwComponent2 )
{
        this.hwComponent1 = hwComponent1;
        this.hwComponent2 = hwComponent2;
}

public HardwareComponent getComponent1 ( )
{
        return this.hwComponent1;
}

public HardwareComponent getComponent2 ( )
{
        return this.hwComponent2;
}

}
