public class CubeCuboidVolumeCalc {
    public static void main(String[] args) {
        // create boxes using the various
        // constructors
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);
        double volume;
        // get volume of first box
        volume = shape1.calculateVolume();
        System.out.println(" Volume of shape1 is " + volume);
        // get volume of second box
        volume = shape2.calculateVolume();
        System.out.println(" Volume of shape2 is " + volume);
        // get volume of cube
        volume = shape3.calculateVolume();
        System.out.println(" Volume of shape3 is " + volume);

    }
}

class ThreeDimensionShape {
    double width, height, depth;
    // constructor used when all dimensions are defined
    ThreeDimensionShape (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when one dimension is defined
    ThreeDimensionShape (double l) {
        width = height = depth = l;
    }
    // constructor used when no dimension is specified
    ThreeDimensionShape() {
        width = height = depth = 0.0;
    }
    // compute and return volume
    double calculateVolume() {
        return width * height * depth;
    }
}


//Write a program in java to illustrate the constructor overloading. (cube and cuboid volume
//calculation)
//
//i) Create a class ThreeDimensionShape with three variables width, height, depth of type
//double;
//
//ii) Create three constructors
//One which Doesn’t accept any parameter
//Another one which Accepts 1 parameter of type double(length)
//Another one which Accepts 3 parameters of type double(width, height, depth)
//
//iii) Create a method calculateVolume of return type double that returns a product of width,
//height, and depth.
//
//iv) in case of No argument constructor make length=width=depth = 0;
//
//v) in case of 1 argument constructor make length=width=depth = value passed;
//
//Stub Code:
//public class ThreeDimensionShape {
//double width, height, depth;
//// constructor used when all dimensions are defined
//ThreeDimensionShape (double w, double h, double d) {
//}
//// constructor used when one dimension is defined
//ThreeDimensionShape (double l) {
//}
//// constructor used when no dimension is specified
//ThreeDimensionShape() {
//}
//// compute and return volume
//double calculateVolume() {
//return width * height * depth;
//}
//}
//public class ConstructorImplementation {
//public static void main(String args[]) {
//// create boxes using the various
//// constructors
//ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
//ThreeDimensionShape shape2 = new ThreeDimensionShape();
//ThreeDimensionShape shape3 = new ThreeDimensionShape(8);
//double volume;
//// get volume of first box
//volume = shape1.calculateVolume();
//System.out.println(" Volume of shape1 is " + volume);
//// get volume of second box
//volume = shape2.calculateVolume();
//System.out.println(" Volume of shape2 is " + volume);
//// get volume of cube
//volume = shape3.volume();
//System.out.println(" Volume of shape3 is " + volume);
//}
//}
//
//Sample output:
//Volume of shape1 is 210.0
//Volume of shape2 is 0.0
//Volume of shape3 is 512.0
