//Lesson1.������� 1. ���������� � ������ ���������� �� ��������� ������
//( ����� �������� �����������(����� Calc))


		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		class Entry{
			
			public static void main(String [] args) throws IOException {
		
		Calc Calculator = new Calc();
      		double a,b,res; // res - result
			int act, repeat; // act - action
			
       		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//��������� ������ � ������������: ��� ����� � ����� ��������
		
		do { // � ������� ����� Do while � ����� ����������� � ������������ ������ ���������� ���������
		
		System.out.print("\n     ������� ������ �����: ");

		a=Double.parseDouble(br.readLine());

		System.out.print("\n     ������� ������ �����: ");

		b=Double.parseDouble(br.readLine());

		System.out.println("\n       1 - ��������");
		System.out.println("       2 - ���������");
		System.out.println("       3 - ���������");		
		System.out.println("       4 - �������");		
				
		// ���� ������������ ������ ������������ �������� ������
		// �� �������� ��� ��� ������ � ��������� ������
		do{
			System.out.print("\n     �������� �������� : ");
			act=Integer.parseInt(br.readLine());
			if (act < 1 || act > 4) System.out.println(" \n      ERROR ! ! !");	
		}while ( act < 1 || act > 4 );
		    
			Calculator.a1 = a;
			Calculator.b1 = b;
			// ���������� � ������ calc ��� ���������� ���������� 
			switch(act) {
				case 1:
					res = Calculator.sum();
					System.out.print("\n   ���������: " + res + "\n");
					break;
				case 2:
					res = Calculator.sub();
					System.out.print("\n   ���������: " + res + "\n");					
					break;
				case 3:
					res = Calculator.mul();
					System.out.print("\n   ���������: " + res + "\n");
					break;
				case 4:
					res = Calculator.div();
					System.out.print("\n   ���������: " + res + "\n");
					break;
			}
		
		
		
		System.out.print("\n     ��������� ���������� ���������? (1 - ��, 0 - ���) : ");
		
			repeat=Integer.parseInt(br.readLine());
			if (repeat < 0 || repeat > 1) System.out.println(" \n      ERROR ! ! !");	// ���� ������������ ������ ��������, �������� ��� ������
		
		
		
		}while ( repeat == 1  );
		
		
		}
	}

		class Calc {
			    
			double a1, b1; // ������������� ���������� ������ ������ Calc
			
			double sum(){     
				return a1 + b1;
			}
			double sub(){
				return a1 - b1;
			}
			double mul(){
				return a1 * b1;
			}
			double div(){
				return a1 / b1;
			}
		}
