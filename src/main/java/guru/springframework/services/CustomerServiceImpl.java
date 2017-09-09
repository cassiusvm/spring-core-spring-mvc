package guru.springframework.services;

import guru.springframework.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer,Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    @Override
    public List<Customer> listAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null){
            if (customer.getId() == null){
                customer.setId(getNextKey());
            }
            customers.put(customer.getId(), customer);

            return customer;
        } else {
            throw new RuntimeException("Customer Can't be nill");
        }
    }

    private Integer getNextKey(){
        return Collections.max(customers.keySet()) + 1;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
    }

    private void loadCustomers(){
        customers = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Customer 1");
        customer1.setLastName("LastName 1");
        customer1.setEmail("customer1@example.com");
        customer1.setPhoneNumber("1111-1111");
        customer1.setAddressLineOne("Street 1");
        customer1.setAddressLineTwo("Silicon Valley");
        customer1.setCity("San Francisco");
        customer1.setState("California");
        customer1.setZipCode("11111");
        

        customers.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Customer 2");
        customer2.setLastName("LastName 2");
        customer2.setEmail("customer2@example.com");
        customer2.setPhoneNumber("2222-2222");
        customer2.setAddressLineOne("Street 2");
        customer2.setAddressLineTwo("Silicon Valley");
        customer2.setCity("San Francisco");
        customer2.setState("California");
        customer2.setZipCode("22222");

        customers.put(2, customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Customer 3");
        customer3.setLastName("LastName 3");
        customer3.setEmail("customer3@example.com");
        customer3.setPhoneNumber("3333-3333");
        customer3.setAddressLineOne("Street 3");
        customer3.setAddressLineTwo("Silicon Valley");
        customer3.setCity("San Francisco");
        customer3.setState("California");
        customer3.setZipCode("33333");

        customers.put(3, customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Customer 4");
        customer4.setLastName("LastName 4");
        customer4.setEmail("customer4@example.com");
        customer4.setPhoneNumber("4444-4444");
        customer4.setAddressLineOne("Street 4");
        customer4.setAddressLineTwo("Silicon Valley");
        customer4.setCity("San Francisco");
        customer4.setState("California");
        customer4.setZipCode("44444");

        customers.put(4, customer4);

        Customer customer5 = new Customer();
        customer5.setId(5);
        customer5.setFirstName("Customer 5");
        customer5.setLastName("LastName 5");
        customer5.setEmail("customer5@example.com");
        customer5.setPhoneNumber("5555-5555");
        customer5.setAddressLineOne("Street 5");
        customer5.setAddressLineTwo("Silicon Valley");
        customer5.setCity("San Francisco");
        customer5.setState("California");
        customer5.setZipCode("55555");

        customers.put(5, customer5);
    }
}
