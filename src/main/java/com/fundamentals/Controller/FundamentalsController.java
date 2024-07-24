package com.fundamentals.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class FundamentalsController {
  
  // Path param
  @GetMapping("/pathParam/{id}")
  public String pathParam(@PathVariable String id){
    return "Path Param : " + id;
  }

  // /primeiraController/queryParam?id=19&nome=Gabriel
  @GetMapping("/queryParam")
  public String queryParam(@RequestParam Map<String, String> allParams){
    return "Query Param : " + allParams.entrySet();
  }
  
  @PostMapping("/bodyParam")
  public String bodyParam(@RequestBody Usuario usuario){
    return "Body Param : " + usuario.username();
  }

  record Usuario(String username){}

}
