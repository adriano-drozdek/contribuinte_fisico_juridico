package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;

public class Projeto {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de contribuintes: ");
		int N = sc.nextInt();
		
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		
		sc.close();
	}

}
