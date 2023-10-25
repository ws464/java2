import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        //ex4();
        //ex5();
        ex6();
    }
    
    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }

    private static void ex2() {
         var p1 = new PersonRefactor();
        var p2 = new PersonRefactor("Jon", "Smith");
        var p3 = new PersonRefactor("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + PersonRefactor.getPersonCount());

        var d1 = new Dog();
        var d2 = new Dog("Jon", "Smith");
        var d3 = new Dog("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(d1.speak());
        System.out.println(d2.speak());
        System.out.println(d3.speak());

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("Dog count: " + Dog.getDogCount());

        var c1 = new Cat();
        var c2 = new Cat("Jon", "Smith");
        var c3 = new Cat("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(c1.speak());
        System.out.println(c2.speak());
        System.out.println(c3.speak());

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Cat count: " + Cat.getCatCount());
        
    }

    private static void ex3() {
        var n1 = new AwesomeNumber(4);
        var n2 = new AwesomeNumber(2);
        var result1 = AwesomeNumber.add(n1, n2);
        var result2 = AwesomeNumber.subtract(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void ex4() {
        var calculator =  new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(calculator.getHistory());
    }

    private static void ex5() {
        /*var shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        System.out.println(shoppingCart.getTotal()); */
        /*var shoppingCart = new ShoppingCart((float)5.00);
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        System.out.println(shoppingCart.getTotal());*/
        var shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        var invoice = shoppingCart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        System.out.println(invoice);
    }
    private static void ex6() {
        var shapes = new ArrayList<Shape>();
shapes.add(new Square(3));
shapes.add(new Rectangle(10,3));
for (Shape s : shapes) {
    System.out.println(s.draw());
}
    }
}
