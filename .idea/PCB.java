public class PCB
{

private Collection<HardwareComponent> hwComponents;
private Collection<CircuitPath> connections;

public void placeComponent ( HardwareComponent hw )
{
        if ( hw )
                this.hwComponents.add ( hw );
}

public boolean connectComponens ( HardwareComponent hw1, HardwareComponent hw2 )
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
                if ( connection != null && connection.hwComponent1 != null && connection.hwComponent2 != null )
                //if ( this.hwComponents.contains( connection.hwComponent1 ) && this.hwComponents.contains( connection.hwComponent2 ) )
                {
                        this.connections.add ( connection );
                        return true;
                }
        }
}

public float calculatePrice ( )
{
        float price = 0;
        HardwareComponent component;

        if ( !( this.hwComponents == null || this.hwComponents.isEmpty() ) )
        {
                for ( component : this.hwComponents )
                        price += component.getPrice ();
        }

        return price;
}

public void showConnectionDetails ( )
{
        CircuitPath connection;
        if ( !( this.connections == null || this.connections.isEmpty() ) )
                for ( connection : this.connections )
                        System.out.println( connection.hwComponent1, "< --- Connected --- >", connection.hwComponent2 );

        System.out.println( this.calculatePrice( ) );
}

}
