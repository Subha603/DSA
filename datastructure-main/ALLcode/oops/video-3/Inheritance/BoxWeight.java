public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
       /*super(l, h, w);*//*here we cannot do it before the subclass
       value initalize the after  super class here give you error becase the 
       super class do not know about the subclass  */
    }
}
