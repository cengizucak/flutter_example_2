public class MySqlCustomerDal implements IcustomerDal,Repository{
    @Override
    public void add() {
        System.out.println("MySql eklendi");
    }
}
