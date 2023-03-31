package aplicacao;

import java.util.Scanner;

import java.util.Locale;

import entidade.Empresa;
import entidade.Individual;
import entidade.TaxaPorPessoa;
import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxaPorPessoa> list = new ArrayList();

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte número " + i + ":");
			System.out.print("Individual ou empresa (i/e):  ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Rendimento Anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'i' || ch == 'I') {
				System.out.print("Gastos com saúde: ");
				double gastosComSaude = sc.nextDouble();
				list.add(new Individual(nome, rendaAnual, gastosComSaude));
			} else if (ch == 'e' || ch == 'E') {
				System.out.print("Numero de funcionarios: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new Empresa(nome, rendaAnual, numeroDeFuncionarios));
			}
		}

		System.out.println();
		System.out.println("Taxa Paga: ");

		double soma = 0.0;
		for (TaxaPorPessoa taxaPorPessoa : list) {
			double taxa = taxaPorPessoa.taxa();// declara a taxa por pessoa, chamando o método taxa de cada uma das
												// classes.
			System.out.println(taxaPorPessoa.getNome() + " : " + "$ " + String.format("%.2f%n", taxa));
			soma += taxa;
		}
		System.out.println("Total arrecado com impostos: " + "$" + String.format("%.2f%n", soma));

	}

}
