class Product {

    private String name;



    Product(String name) {

        this.name = name;

    }



    String name() {

        return name;

    }



    void rename(String newName) {

        name = newName;

    }

}public class main {

    public static void main(String[] args) {

        Product a = new Product("CHAIR-A");

        Product b = new Product("CHAIR-A");



        b.rename("CHAIR-B");



        System.out.println("a: " + a.name());

        System.out.println("b: " + b.name());

    }

}
