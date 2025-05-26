// src/test/java/com/zollo/springstore/EntityCreationTests.java
package com.zollo.springstore;

import com.zollo.springstore.domain.Customer;
import com.zollo.springstore.domain.Product;
import com.zollo.springstore.domain.CustomerOrder;
import com.zollo.springstore.repository.CustomerRepository;
import com.zollo.springstore.repository.ProductRepository;
import com.zollo.springstore.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CreationTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository customerOrderRepository;

    @Test
    void canCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("John Doe");
        Customer saved = customerRepository.save(customer);
        assertThat(saved.getId()).isNotNull();
    }

    @Test
    void canCreateProduct() {
        Product product = new Product();
        product.setName("Widget");
        product.setPrice(9);
        Product saved = productRepository.save(product);
        assertThat(saved.getId()).isNotNull();
    }

    @Test
    void canCreateCustomerOrder() {
        Customer customer = new Customer();
        customer.setName("Jane Doe");
        customer = customerRepository.save(customer);

        Product product = new Product();
        product.setName("Gadget");
        product.setPrice(19);
        product = productRepository.save(product);

        CustomerOrder order = new CustomerOrder();
        order.setCustomer(customer);
        order.setProducts(Collections.singletonList(product));
        CustomerOrder saved = customerOrderRepository.save(order);

        assertThat(saved.getId()).isNotNull();
        assertThat(saved.getCustomer()).isEqualTo(customer);
        assertThat(saved.getProducts()).contains(product);
    }
}