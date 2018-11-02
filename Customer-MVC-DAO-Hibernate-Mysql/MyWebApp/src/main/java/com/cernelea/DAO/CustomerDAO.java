package com.cernelea.DAO;

import com.cernelea.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomerList();


    void saveCustomer(Customer customer);

   

    void updateCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
