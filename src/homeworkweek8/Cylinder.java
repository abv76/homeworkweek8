package homeworkweek8;

/*
(19). Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double.
It needs to call the parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needs to return the value of height
field.

● Method named getVolume without any parameters, it needs to return the calculated volume.
To calculate volume multiply the area with height.

 */
//Child class
public class Cylinder extends Circle {

// Instance variable

    private double height;

    public Cylinder(double radius, double h) {
        super(radius);


        if (height < 0) {
            h = 0;

        } else {
            height = h;
        }

    }

    public Cylinder(double h, double radius, Object radius1) {
    }

    public double getHeight() {

        return height;
    }

    public double getVolume() {

        return super.getArea() * getHeight(); // call value from parent class

    }


}
