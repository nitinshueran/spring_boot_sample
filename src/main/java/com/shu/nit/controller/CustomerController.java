package com.shu.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shu.nit.model.Customer;

@Controller
@RequestMapping("${server.context.path}")
public class CustomerController {

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public @ResponseBody List<Customer> getCustomers() {
        List<Customer> customers = Arrays.asList(new Customer("1", "Akshita", "Sheoran"),
                new Customer("2", "Nitin", "Sheoran"), new Customer("3", "Nitesh", "Sheoran"));
        return customers;
    }

}
