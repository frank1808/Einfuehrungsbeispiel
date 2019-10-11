//import


public class Configurator
{

public static void main ( String[] args )
{
        Capacitor cap1 = new Capacitor ("no3234", 110, 1 );
        Capacitor cap2 = new Capacitor ("no3235", 120, 2 );
        Capacitor cap3 = new Capacitor ("no3236", 130, 3 );
        Capacitor cap4 = new Capacitor ("no3237", 140, 4 );
        Capacitor cap5 = new Capacitor ("no3238", 150, 5 );
        Capacitor cap6;

        Resistor res1 = new Resistor ("no7834", 410, 1 );
        Resistor res2 = new Resistor ("no7835", 420, 2 );
        Resistor res3 = new Resistor ("no7836", 430, 3 );
        Resistor res4 = new Resistor ("no7837", 440, 4 );
        Resistor res5 = new Resistor ("no7838", 450, 5 );

        /*System.out.println( cap1.getValue() );
        System.out.println(  );
        System.out.println( cap1.getPrice() );*/

        PCB pcb = new PCB  ( );

        pcb.placeComponent ( cap1 );
        pcb.placeComponent ( cap2 );
        pcb.placeComponent ( cap3 );
        pcb.placeComponent ( cap4 );
        pcb.placeComponent ( cap5 );

        pcb.placeComponent ( res1 );
        pcb.placeComponent ( res2 );
        pcb.placeComponent ( res3 );
        pcb.placeComponent ( res4 );
        pcb.placeComponent ( res5 );

        pcb.connectComponents ( cap1, cap2 );
        pcb.connectComponents ( cap1, cap3 );
        pcb.connectComponents ( cap1, res1 );
        pcb.connectComponents ( cap4, res2 );
        pcb.connectComponents ( cap3, cap1 );

        pcb.connectComponents ( cap1, cap2 );

        pcb.showConnectionDetails();

        /*ArrayList <Capacitor> test = new ArrayList<Capacitor> ( );

        if ( test.contains(cap1) )
        test.add ( cap1 );

        test.add ( cap2 );

        System.out.println( test );*/

       /* Collection <HardwareComponent> hwComponents;
        ArrayList <HardwareComponent> hwComponents2;

        if ( hwComponents2 );*/


}


}
