package com.fundamentals.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class FundamentalsController {
  
  // Path param
  @GetMapping("/pathParam/{id}")
  public String primeiroMetodo(@PathVariable String id){
    return "Hello World!" + id;
  }

}
