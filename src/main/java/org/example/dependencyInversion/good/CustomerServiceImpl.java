package org.example.dependencyInversion.good;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl {

    private final CustomerDao customerDao;

    public CustomerServiceImpl(InMemoryCustomerDao customerDao) {
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