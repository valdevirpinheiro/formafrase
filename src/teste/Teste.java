package teste;

public class Teste {
	public static void main(String[] args) {
		String[][] Hino = { { " Ouviram do Ipiranga ", " De um povo heroico o brado retumbante ",
				" E o sol da liberdade, em raios f�lgidos ", " Brilho no c�u da p�tria nesse instante. " },

				{ " Se o penhor dessa igualdade ", " Conseguimos conquistar com bra�o forte ",
						" Em teu seio, � liberdade ", " Desafia o nosso peito � pr�pria morte! " },
				{ " � P�tria amada ", " Idolatrada ", " Salve! Salve! ", " # 123 456 k " },

				{ " Brasil, um sonho intenso, um raio v�vido ", " De amor e de esperan�a � terra desce ",
						" Se em teu formoso c�u, risonho e l�mpido ", " A imagem do Cruzeiro resplandece. " }

		};
		Integer[][] matrizTeste = {
				{ 0, 2, 0 }, 
				{ 1, 2, 5 },
				{ 0, 0, 7 },
				{ 3, 0, 34 }, 
				{ 1, 3, 8 }, 
				{ 0, 3, 13 },
				{ 2, 2, 6 }, 
				{ 2, 3, 0 }, 
				{ 3, 2, 28 }, 
				{ 0, 3, 16 }, 
				{ 1, 1, 34 },
				{ 2, 3, 10 }, 
				{ 1, 2, 21 },
				{ 1, 3, 19 }, 
				{ 3, 3, 10 }, 
				{ 0, 3, 8 }, 
				{ 0, 0, 12 }, 
				{ 2, 1, 6 }, 
				{ 2, 3, 2 },
				{ 2, 3, 8 } };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < matrizTeste.length; i++) {
			//for (int j = 0; j < matrizTeste.length; j++) {
				sb.append(Hino[matrizTeste[i][0]][matrizTeste[i][1]].trim().charAt(matrizTeste[i][2]));
		//	}
		}
		System.out.println(sb.toString());
		
	}
}
