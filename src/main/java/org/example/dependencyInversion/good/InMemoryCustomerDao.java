package org.example.dependencyInversion.good;

import java.util.List;
import java.util.Optional;

public class InMemoryCustomerDao implements CustomerDao {
    public Optional<Customer> findById(int id) {
        return null;
    }

    public List<Customer> findAll() {
        return null;
    }
}
