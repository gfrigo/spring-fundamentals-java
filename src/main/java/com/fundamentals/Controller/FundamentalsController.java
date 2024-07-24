package com.fundamentals.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class FundamentalsController {

  record Usuario(String username){}
  
  // Path param
  @GetMapping("/pathParam/{id}")
  public String pathParam(@PathVariable String id){
    return "Path Param: " + id;
  }

  // /primeiraController/queryParam?id=19&nome=Gabriel
  @GetMapping("/queryParam")
  public String queryParam(@RequestParam Map<String, String> allParams){
    return "Query Param: " + allParams.entrySet();
  }
  
  // Recuperar informações contidas no JSON da requisição
  @PostMapping("/bodyParam")
  public String bodyParam(@RequestBody Usuario usuario){
    return "Body Param: " + usuario.username();
  }

  @PostMapping("/headerParam")
  public String headerParam(@RequestHeader Map<String, String> headers){
    return "Header Params: " + headers.entrySet();
  }

  // Retornar, mediante ação, uma resposta de status HTTP e informações no corpo
  @GetMapping("/responseEntity/{id}")
  public ResponseEntity<Object> responseEntity(@PathVariable int id){
    Usuario usuario = new Usuario("Gabriel Frigo");

    if(id > 5){
      return ResponseEntity.status(HttpStatus.OK).body("Sucesso! " + usuario.username());
    }else{
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Erro!");
    }
  }

}
