		
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import static java.lang.Math.*;	
		
	/**
		*Урок 1. Домашнее задание №3
		*@version 1.100500 29.07.2016
		*@author Nikolay Bondarenko
		*/
		
		class Function {
			public static void main(String [] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Calculation FunCulc = new Calculation();
			double result;
			double start,finish,step;
			double variable1;
			double variableGrad;			
			
			System.out.print("\n введите начало промежутка: ");
			start=Double.parseDouble(br.readLine());			
			System.out.print("\n введите конец промежутка: ");
			finish=Double.parseDouble(br.readLine());
			System.out.print("\n введите шаг промежутка: ");
			step=Double.parseDouble(br.readLine());
			System.out.println();
			for (double a = start; a <= finish; a = a + step ){
			
			variableGrad = (a*3.14)/180;
			FunCulc.variable = variableGrad;
			result = FunCulc.result();
			System.out.print(  "  |  " + a + "  |  " + result + "\n");
			
			}
		}
	}
						
		class Calculation {
			double variable;
			
			double result(){
			
			return tan(2*variable)-3;
			}
		}
		
		
		
		
		
		/*sqrt(a)
		pow(a,n)
		sin(a), cos(a), tan(a)
		*/