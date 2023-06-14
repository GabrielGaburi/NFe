package Entities;

import java.util.Scanner;

public interface Interface {
	Scanner leia = new Scanner(System.in);
	abstract void entrar();
	abstract void imprimir();
}
