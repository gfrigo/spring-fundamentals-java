package com.fundamentals.IocDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/componente")
public class ComponenteController {

  // Evitar de instanciar o mesmo objeto várias vezes
  // Autowired autogerencia a instância de Componente()
  @Autowired
  Componente componente;

  @GetMapping("/")
  public String chamandoComponente(){
    String resultado = componente.component();
    return resultado;
  }
}
