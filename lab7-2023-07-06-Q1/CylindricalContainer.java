
package com.mycompan.javalab8;

public class CylindricalContainer extends Container
{
    private double height,radius;
    public CylindricalContainer(double height,double radius)
    {
        this.height=height;
        this.radius=radius;
    }
    public double volume()
    {
        return 3.1459f*radius*radius*height;
    }
}
