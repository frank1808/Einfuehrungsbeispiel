//import

import java.util.ArrayList;

public class Configurator
{

public static void main ( String[] args )
{
        Capacitor cap1 = new Capacitor ("no3234", 160, 3 );
        Capacitor cap2 = new Capacitor ("no3232", 170, 4 );
        //HardwareComponent hc1 = new HardwareComponent ( "no32341", 130.0 );

        System.out.println( cap1.getValue() );
        System.out.println(  );
        System.out.println( cap1.getPrice() );

        ArrayList <Capacitor> test = new ArrayList<Capacitor> ( );

        if ( test.contains(cap1) )
        test.add ( cap1 );

        test.add ( cap2 );

        System.out.println( test );

        Collection <HardwareComponent> hwComponents;
        ArrayList <HardwareComponent> hwComponents2;

        if ( hwComponents2 );


}


}
