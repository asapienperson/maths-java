/**
 * Class that represents a 3D vector (with i, j, and k components)
 */
public class Vector3D
{
    //attributes
    private double i;
    private double j;
    private double k;
    /**
     * Constructor with no parameters: sets all components to 0
     */
    public Vector3D()
    {
        i = 0;
        j = 0;
        k = 0;
    }
    /**
     * Constructor with values as parameters
     */
    public Vector3D(double i, double j, double k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    /**
     * Constructor that copies another vector
     */
    public Vector3D(Vector3D v)
    {
        i = v.i;
        j = v.j;
        k = v.k;
    }
}