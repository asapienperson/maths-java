
/**
 * Class that represents a 2D vector (with i and j components)
 */
public class Vector2D
{
    //attributes
    private double i;
    private double j;
    /**
     * Constructor with no parameters: sets both components to 0
     */
    public Vector2D()
    {
        i = 0;
        j = 0;
    }
    /**
     * Constructor with values as parameters
     */
    public Vector2D(double i, double j)
    {
        this.i = i;
        this.j = j;
    }
    /**
     * Constructor that copies another vector
     */
    public Vector2D(Vector2D v)
    {
        i = v.i;
        j = v.j;
    }
    /**
     * Accesses vector's i component
     */
    public double getI()
    {
        return i;
    }
    /**
     * Accesses vector's j component
     */
    public double getJ()
    {
        return j;
    }
    /**
     * Sets vector's i component
     */
    public void setI(double i)
    {
        this.i = i;
    }
    /**
     * Sets vector's j component
     */
    public void setJ(double j)
    {
        this.j = j;
    }
    /**
     * Sets both components of vector
     */
    public void set(double i, double j)
    {
        this.i = i;
        this. j = j;
    }
    /**
     * Returns norm of vector
     */
    public double norm()
    {
        return Math.hypot(i,j);
    }
    /**
     * Returns sum of vector and other vector
     */
    public Vector2D add(Vector2D v)
    {
        return new Vector2D(i+v.i,j+v.j);
    }
    /**
     * Returns sum of vector and vector given by components in parameters
     */
    public Vector2D add(double i, double j)
    {
        return new Vector2D(this.i+i,this.j+j);
    }
    /**
     * Returns result of subtracting vector v from vector
     */
    public Vector2D subtract(Vector2D v)
    {
        return new Vector2D(i-v.i,j-v.j);
    }
    /**
     * Returns result of subtracting vector (given by components) from vector
     */
    public Vector2D subtract(double i, double j)
    {
        return new Vector2D(this.i-i,this.j-j);
    }
    /**
     * Returns vector multiplied by scalar
     */
    public Vector2D multiply(double a)
    {
        return new Vector2D(a*i,a*j);
    }
    /**
     * Checks if vector is equal to another vector
     */
    public boolean equals(Vector2D v)
    {
        if (i == v.i && j == v.j) return true;
        else return false;
    }
    /**
     * Checks if vector is equal to another vector (given by components)
     */
    public boolean equals (double i, double j)
    {
        if (this.i == i && this.j == j) return true;
        else return false;
    }
    /**
     * Returns dot product of vector and another vector
     */
    public double dot(Vector2D v)
    {
        return (i*v.i+j*v.j);
    }
    /**
     * Returns dot product of vector and another vector (given by components)
     */
    public double dot(double i, double j)
    {
        return (this.i*i+this.j*j);
    }
    /**
     * Returns projection of vector onto another vector
     */
    public Vector2D proj(Vector2D v)
    {
        double a = this.dot(v)/v.dot(v);
        return new Vector2D(a*v.i,a*v.j);
    }
    /**
     * Returns projection of vector onto another vector (given by components)
     */
    public Vector2D proj(double i, double j)
    {
        double a = this.dot(i,j)/(i*i+j*j);
        return new Vector2D(a*i,a*j);
    }
    /**
     * Displays vector as a string
     */
    public String toString()
    {
        return ("⟨"+i+","+j+"⟩");
    }
}