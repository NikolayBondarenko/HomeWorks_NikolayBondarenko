		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import static java.lang.Math.*;	
		
	/**
		*���� 1. �������� ������� �2
		*@version 1.100500 29.07.2016
		*@author Nikolay Bondarenko
		*/
		
		class Iteration {
			public static void main(String [] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			double e;
			
			// ����������� �������� � ������������
			System.out.print("\n     ������� �������� \"e\": ");			
			e=Double.parseDouble(br.readLine());
			
			
			for (int n=0; ;n++){
			double a = 1/pow(n+1, 2);
			System.out.print(n+1+"."); // �������� +1 ����� ������������������ ���������� �� � ����, � � �������
			
			// ���������� ���� if ��� ��������������� ������� ������ 9 ����� ���� ������� � ��������� ������ =)
			if (n<10) System.out.print(" "); 
			System.out.println("  " + a);
			
			// ������� ���������� ����� � ����� ���������� ��������
			if (a<e){
			System.out.println("\n\n ����� ����������� �������� ������������������: " + (n+1));
			break;
				}
			}
		}
	}
		
		
		
		
		