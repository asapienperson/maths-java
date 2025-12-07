
/**
 * Class representing complex numbers because bored
 */
public class Complex
{
    private double a, b, c, d;//variables to assist methods
    
    //attributes
    private double re;
    private double im;
    public Complex (double real, double imag)
    {
        re = real;
        im = imag;
    }
    public Complex()
    {
        re = 0;
        im = 0;
    }
    public double abs()
    {
        return Math.hypot(re, im);
    }
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
    public Complex conjugate()
    {
        return new Complex(re,-1*im);
    }
    public Complex add(Complex z)
    {
        return new Complex(re+z.re,im+z.im);
    }
    public Complex subtract(Complex z)
    {
        return new Complex(re-z.re,im-z.im);
    }
    public Complex multiply(Complex z)
    {
        return new Complex(re*z.re-im*z.im,re*z.im+z.re*im);
    }
    public Complex divide(Complex z)
    {
        return new Complex((re*z.re+im*z.im)/(z.re*z.re+z.im*z.im),(z.re*im-re*z.im)/(z.re*z.re+z.im*z.im));
    }
}