
/**
 * Class representing complex numbers because bored
 */
public class Complex
{   
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
     * Constructor for complex numbers, copying value of other complex number
     */
    public Complex(Complex z)
    {
        re = z.re;
        im = z.im;
    }
    /**
     * Returns real component of complex number
     */
    public double re()
    {
        return re;
    }
    /**
     * Returns imaginary component of complex number
     */
    public double im()
    {
        return im;
    }
    /**
     * Sets real component of complex number
     */
    public void setRe(double real)
    {
        re = real;
    }
    /**
     * Sets imaginary component of complex number
     */
    public void setIm(double imag)
    {
        im = imag;
    }
    /**
     * Sets complex number to another value
     */
    public void set(double real, double imag)
    {
        re = real;
        im = imag;
    }
    /**
     * Sets complex number to value of another complex number
     */
    public void set(Complex z)
    {
        re = z.re;
        im = z.im;
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
        return (Math.atan2(im,re));
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
     * Multiplies complex number by real number
     */
    public Complex multiply(double n)
    {
        return new Complex(n*re,n*im);
    }
    /**
     * Divides complex number by complex number z
     */
    public Complex divide(Complex z)
    {
        return new Complex((re*z.re+im*z.im)/(z.re*z.re+z.im*z.im),(z.re*im-re*z.im)/(z.re*z.re+z.im*z.im));
    }
    /**
     * Divides complex number by real number
     */
    public Complex divide(double n)
    {
        return new Complex(re/n,im/n);
    }
    /**
     * Returns exponent of a complex number to a real power
     */
    public Complex pow(double exp)
    {
        return new Complex(Math.pow(this.abs(),exp)*Math.cos(exp*this.arg()),
        Math.pow(this.abs(),exp)*Math.sin(exp*this.arg()));
    }
    /**
     * Returns e raised to the power of complex number
     */
    public Complex exp()
    {
        return new Complex(Math.pow(Math.E,re)*Math.cos(im),Math.pow(Math.E,re)*Math.sin(im));
    }
    /**
     * Returns natural logarithm of complex number
     */
    public Complex log()
    {
        return new Complex(Math.log(this.abs()),this.arg());
    }
    /**
     * Returns complex number raised to the power of complex number
     */
    public Complex expBase(Complex base)
    {
        return (this.multiply(base.log())).exp();
    }
    /**
     * Checks if two complex numbers are equivalent.
     */
    public boolean equals(Complex z)
    {
        if (re == z.re && im == z.im) return true;
        else return false;
    }
    /**
     * Processes complex number as String
     */
    public String toString(Complex z)
    {
        if (im >= 0)
        return (re + "+" + im + "i");
        else
        return (re + im + "i");
    }
}