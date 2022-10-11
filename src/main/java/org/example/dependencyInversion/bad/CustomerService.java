package org.example.dependencyInversion.bad;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final InMemoryCustomerDao customerDao;

    public CustomerService(InMemoryCustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    // standard constructor / getter
    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}