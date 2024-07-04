import java.util.ArrayList;

public class Data {
    ArrayList<Customer> list = new ArrayList<>();

    public Data() {
        Customer c1 = new Customer(101, "Ramesh", "Indian Bank", 1234, 20000);
        Customer c2 = new Customer(102, "Sita", "ICICI Bank", 2007, 30000);
        Customer c3 = new Customer(103, "Akash", "Indian Bank", 1983, 40000);
        Customer c4 = new Customer(104, "Priya", "HDFC Bank", 1976, 2000);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
    }

    public void updateCustomer(Customer updatedCustomer) {
        for (Customer customer : list) {
            if (customer.getCusId() == updatedCustomer.getCusId()) {
                customer.setName(updatedCustomer.getName());
                customer.setBank(updatedCustomer.getBank());
                customer.setBalance(updatedCustomer.getBalance());
                break; 
            }
        }
    }
    
    public ArrayList<Customer> getList() {
        return list;
    }
}
