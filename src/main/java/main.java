
public class main {

    public static void main(String[] args) {
/*
        Customer Amy = new Customer();
        Amy.consumption = 1000;

        System.out.print("Pay:");
        //System.out.print(Amy.cost(1000));
*/
        Customer Amy = new Customer(1,1200);
        Amy.print();

        System.out.println();

        //2200---->2000??
        Customer Tina = new SilverCustomer(2,2200);
        Tina.print();

        System.out.println();

        Customer Helen = new GoldenCustomer(3,3600);
        Helen.print();




    }

}


