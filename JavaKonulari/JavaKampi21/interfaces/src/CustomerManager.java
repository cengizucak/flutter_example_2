public class CustomerManager {

    private IcustomerDal customerDal;

    public CustomerManager(IcustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        //* burda is kodlari yazilir

        customerDal.add();

    }
}
