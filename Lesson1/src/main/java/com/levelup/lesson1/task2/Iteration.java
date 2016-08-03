		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import static java.lang.Math.*;	
		
	/**
		*“рок 1. „омашнее задание Ь2
		*@version 1.100500 29.07.2016
		*@author Nikolay Bondarenko
		*/
		
		class Iteration {
			public static void main(String [] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			double e;
			
			// ‡апрашиваем точность у пользователЯ
			System.out.print("\n     задайте точность \"e\": ");			
			e=Double.parseDouble(br.readLine());
			
			
			for (int n=0; ;n++){
			double a = 1/pow(n+1, 2);
			System.out.print(n+1+"."); // добавили +1 чтобы последовательность начиналась не с нулЯ, а с единицы
			
			// используем этот if длЯ дополнительного отступа первых 9 чисел ради ровного и красивого вывода =)
			if (n<10) System.out.print(" "); 
			System.out.println("  " + a);
			
			// условие прерываниЯ цикла и вывод последнего элемента
			if (a<e){
			System.out.println("\n\n номер наименьшего элемента последовательности: " + (n+1));
			break;
				}
			}
		}
	}
		
		
		
		
		