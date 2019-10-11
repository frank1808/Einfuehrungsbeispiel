//import

public abstract class HardwareComponent {

private String id;
private float price;

public HardwareComponent ( String id, float price )
{
        this.id = id;
        this.price = price;
}

public float getPrice ( )
{
        return this.price;
}

public void setPrice ( float new_price )
{
        this.price = new_price;
}

public String getId ( )
{
        return this.id;
}

public void setId ( String new_Id )
{
        this.id = new_Id;
}

}
