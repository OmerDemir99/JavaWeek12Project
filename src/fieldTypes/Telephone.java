package fieldTypes;

public class Telephone {
    public String number;
    public static int quantity ;
    public static double total ;
    static {
        quantity = 250;
        total = 15658.92;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
       return this.number;
    }

    public static void main(String[] args) {

        Telephone tel1 = new Telephone();
        System.out.println(tel1.total);

        tel1.setNumber("555-3424423");
        System.out.println("tel1.getNumber() = " + tel1.getNumber());

        System.out.println("Telephone = " + Telephone.total);


    }

}
 /*
    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
     */