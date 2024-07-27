package com.fundamentals.IocDi;

import org.springframework.stereotype.Service;

// Indicar ao Spring que é um @Service ou @Component
@Service
public class Componente {
  
  public String component(){
    return "Olá, sou o componente.";
  }
  
}
