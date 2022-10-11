package org.example.dependencyInversion.bad;

import java.util.List;
import java.util.Optional;

public class InMemoryCustomerDao {
    public Optional<Customer> findById(int id) {
        return null;
    }

    public List<Customer> findAll() {
        return null;
    }
}
