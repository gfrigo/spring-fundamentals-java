package com.fundamentals.spring_fundamentals_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class FundamentalsController {
  
  @GetMapping("/primeiroMetodo")
  public String primeiroMetodo(){
    return "Hello World!";
  }

}
