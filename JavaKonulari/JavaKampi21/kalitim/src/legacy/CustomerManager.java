package legacy;

public class CustomerManager {

    public void add(Customer customer) {

        System.out.println(customer.customerNumber + " kaydedildi");

    }

    public void addMultiple(Customer[] customers) {

        for (Customer musteri : customers) {
            add(musteri);

        }


    }

}

//SOLID open closed principle