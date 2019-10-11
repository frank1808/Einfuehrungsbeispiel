import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PCB
{

private Collection<HardwareComponent> hwComponents = new ArrayList<HardwareComponent>();
private Collection<CircuitPath> connections = new ArrayList<CircuitPath>();

public void placeComponent ( HardwareComponent hw )
{
        if ( hw != null )
                this.hwComponents.add ( hw );
}

public boolean connectComponents ( HardwareComponent hw1, HardwareComponent hw2 )
{
        if ( !( this.hwComponents == null || this.hwComponents.isEmpty() ) )
        {
                if ( this.hwComponents.contains( hw1 ) && this.hwComponents.contains( hw2 ) )
                {
                        this.connections.add ( new CircuitPath ( hw1, hw2 ) );
                        return true;
                }
        }
        return false;
}


public void addConnection ( CircuitPath connection )
{
        //if ( !( this.hwComponents == null || this.hwComponents.isEmpty() ) )
        {
                if ( connection != null && connection.getComponent1() != null && connection.getComponent1() != null )
                //if ( this.hwComponents.contains( connection.hwComponent1 ) && this.hwComponents.contains( connection.hwComponent2 ) )
                {
                        this.connections.add ( connection );
                }
        }
}

public float calculatePrice ( )
{
        float price = 0;
        //HardwareComponent component;

        if ( !( this.hwComponents == null || this.hwComponents.isEmpty() ) )
        {
                for ( HardwareComponent component : this.hwComponents )
                        price += component.getPrice ();
        }

        return price;
}

public void showConnectionDetails ( )
{
        //CircuitPath connection;
        if ( !( this.connections == null || this.connections.isEmpty() ) )
                for ( CircuitPath connection : this.connections )
                        System.out.println( connection.getComponent1().getId() + "< --- Connected --- >" + connection.getComponent2().getId()  );

        System.out.println( this.calculatePrice( ) );
}

}
