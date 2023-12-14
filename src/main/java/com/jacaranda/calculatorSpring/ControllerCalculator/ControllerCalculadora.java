package com.jacaranda.calculatorSpring.ControllerCalculator;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.jacaranda.model.Calculadora;

@Controller
public class ControllerCalculadora {
	
	@GetMapping("/calculadora")
	public String calculadora(Model model) {
	    Calculadora cal = new Calculadora();
	    
	    // Se agrega la instancia cal al modelo con el nombre "calculadora"
	    model.addAttribute("calculadora", cal);
	    
	
	    return "index";
	}

	@GetMapping("/resolver")
	public String resolver(Model model, @ModelAttribute("calculadora") Calculadora cal2) {
	    Calculadora cal = new Calculadora();
	    
	    model.addAttribute("calculadora", cal);
	    
	    String resultado = "Resultado: " + cal2.getNumero1() + " " + cal2.getOperador() + " " + cal2.getNumero2() + " = " + cal2.calcular();
	    
	    // Se agrega el resultado al modelo con el nombre "resultado"
	    model.addAttribute("resultado", resultado);
	    
	 
	    return "index";
	}


	
}
