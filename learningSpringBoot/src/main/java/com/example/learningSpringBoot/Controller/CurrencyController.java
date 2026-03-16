package com.example.learningSpringBoot.Controller;

import com.example.learningSpringBoot.Service.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-configuration")
public class CurrencyController {
    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping
    public CurrencyServiceConfiguration getInfo() {
        return currencyServiceConfiguration;
    }
}
