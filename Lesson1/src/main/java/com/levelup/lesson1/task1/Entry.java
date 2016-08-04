//Lesson1.Задание 1. Компиляция и запуск приложения из командной строки
//( нужно дописать калькулятор(класс Calc))


		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		class Entry{
			
			public static void main(String [] args) throws IOException {
		
		Calc Calculator = new Calc();
      		double a,b,res; // res - result
			int act, repeat; // act - action
			
       		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//Считываем данные у пользователя: два числа и выбор операции
		
		do { // С помощью цикла Do while в конце запрашиваем у пользователя повтор выполнения программы
		
		System.out.print("\n     Введите первое число: ");

		a=Double.parseDouble(br.readLine());

		System.out.print("\n     Введите второе число: ");

		b=Double.parseDouble(br.readLine());

		System.out.println("\n       1 - сложение");
		System.out.println("       2 - вычитание");
		System.out.println("       3 - умножение");		
		System.out.println("       4 - деление");		
				
		// Если пользователь вводит некорректное значение выбора
		// то сообщаем ему про ошибку и повторяем запрос
		do{
			System.out.print("\n     Выберите действие : ");
			act=Integer.parseInt(br.readLine());
			if (act < 1 || act > 4) System.out.println(" \n      ERROR ! ! !");	
		}while ( act < 1 || act > 4 );
		    
			Calculator.a1 = a;
			Calculator.b1 = b;
			// обращаемся к классу calc для проведения вычислений 
			switch(act) {
				case 1:
					res = Calculator.sum();
					System.out.print("\n   Результат: " + res + "\n");
					break;
				case 2:
					res = Calculator.sub();
					System.out.print("\n   Результат: " + res + "\n");					
					break;
				case 3:
					res = Calculator.mul();
					System.out.print("\n   Результат: " + res + "\n");
					break;
				case 4:
					res = Calculator.div();
					System.out.print("\n   Результат: " + res + "\n");
					break;
			}
		
		
		
		System.out.print("\n     Повторить выполнение программы? (1 - ДА, 0 - НЕТ) : ");
		
			repeat=Integer.parseInt(br.readLine());
			if (repeat < 0 || repeat > 1) System.out.println(" \n      ERROR ! ! !");	// если пользователь вводит четонето, сообщаем про ошибку
		
		
		
		}while ( repeat == 1  );
		
		
		}
	}

		class Calc {
			    
			double a1, b1; // инициализация переменных внутри класса Calc
			
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
