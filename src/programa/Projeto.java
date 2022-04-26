package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número de contribuintes: ");
		int N = sc.nextInt();

		List<Contribuinte> list = new ArrayList<Contribuinte>();

		for (int i = 1; i <= N; i++) {
			System.out.println("Contribuinte #" + i);
			System.out.print("Física ou Jurídica (f/j)? ");
			char pessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual:");
			Double rendaAnual = sc.nextDouble();
			if (pessoa == 'f') {
				System.out.print("Despesas com saúde: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new Fisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Número de pessoas: ");
				Integer numeroPessoas = sc.nextInt();
				list.add(new Juridica(nome, rendaAnual, numeroPessoas));
			}
		}

		System.out.println();
		System.out.println("Imposto pago:");
		for (Contribuinte ct : list) {
			System.out.println(ct.getNome() + ": $ " + String.format("%.2f", ct.imposto()));
		}
		
		System.out.println();
		double soma = 0;
		for(Contribuinte ct : list) {
			soma += ct.imposto();
		}
		System.out.println("Total dos impostos: $ " + String.format("%.2f", soma));
		sc.close();
	}

}
