
/**
 * Class representing complex numbers because bored
 */
public class Complex
{
    private double a, b, c, d;//variables to assist methods
    
    //attributes
    private double re;
    private double im;
    /**
     * Constructor for complex numbers, given parameters for real and imaginary components
     */
    public Complex (double real, double imag)
    {
        re = real;
        im = imag;
    }
    /**
     * Constructor for complex numbers, gives value of 0
     */
    public Complex()
    {
        re = 0;
        im = 0;
    }
    /**
     * Returns absolute value (magnitude) of complex number
     */
    public double abs()
    {
        return Math.hypot(re, im);
    }
    /**
     * Returns argument (angle) of complex number
     */
    public double arg()
    {
        if (re == 0)
        {
            if (im > 0) return Math.PI/2;
            else if (im < 0) return (3*Math.PI/2);
            else return 0;
        }
        else if (re>0)
        {
            a = Math.atan(im/re);
            if (a<0) a+=(2*Math.PI);
            return a;
        }
        else
        return (Math.PI+Math.atan(im/re));
    }
    /**
     * Returns conjugate of complex number
     */
    public Complex conjugate()
    {
        return new Complex(re,-1*im);
    }
    /**
     * Adds complex number z to complex number, returning new complex number
     */
    public Complex add(Complex z)
    {
        return new Complex(re+z.re,im+z.im);
    }
    /**
     * Subtracts complex number z from complex number
     */
    public Complex subtract(Complex z)
    {
        return new Complex(re-z.re,im-z.im);
    }
    /**
     * Multiplies complex number by complex number z
     */
    public Complex multiply(Complex z)
    {
        return new Complex(re*z.re-im*z.im,re*z.im+z.re*im);
    }
    /**
     * Divides complex number by complex number z
     */
    public Complex divide(Complex z)
    {
        return new Complex((re*z.re+im*z.im)/(z.re*z.re+z.im*z.im),(z.re*im-re*z.im)/(z.re*z.re+z.im*z.im));
    }
    /**
     * Processes complex number as String
     */
    public String toString(Complex z)
    {
        return (re + "+" + im + "i");
    }
}