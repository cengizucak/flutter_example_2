package legacy;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer cengiz=new IndividualCustomer();
        cengiz.customerNumber="4444";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="8888";

        Sendika sendika=new Sendika();
        sendika.customerNumber="9999";

        CustomerManager customerManager=new CustomerManager();

        Customer[] musteriler={cengiz,hepsiBurada,sendika};

        customerManager.addMultiple(musteriler);



    }
}