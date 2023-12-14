package com.jacaranda.model;

import java.util.Objects;

public class Calculadora {

	private int numero1;
	private int numero2;
	private String operador;

	public Calculadora() {
		super();
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int calcular() {
	    int resultado = 0;

	    switch (this.operador) {
	        case "+":
	            resultado = this.numero1 + this.numero2;
	            break;
	        case "-":
	            resultado = this.numero1 - this.numero2;
	            break;
	        case "*":
	            resultado = this.numero1 * this.numero2;
	            break;
	        case "/":
	            resultado = this.numero1 / this.numero2;
	            break;
	        default:
	            break;
	    }

	    return resultado;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(numero1, numero2, operador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		return numero1 == other.numero1 && numero2 == other.numero2 && operador == other.operador;
	}
	
		
}
