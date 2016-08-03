//Lesson1.Çàäàíèå 1. Êîìïèëÿöèÿ è çàïóñê ïðèëîæåíèÿ èç êîìàíäíîé ñòðîêè
//( íóæíî äîïèñàòü êàëüêóëÿòîð(êëàññ Calc))
//hello

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		class Entry{
			
			public static void main(String [] args) throws IOException {
		
		Calc Calculator = new Calc();
      		double a,b,res; // res - result
			int act, repeat; // act - action
			
       		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		//Ñ÷èòûâàåì äàííûå ó ïîëüçîâàòåëÿ: äâà ÷èñëà è âûáîð îïåðàöèè
		
		do { // Ñ ïîìîùüþ öèêëà Do while â êîíöå çàïðàøèâàåì ó ïîëüçîâàòåëÿ ïîâòîð âûïîëíåíèÿ ïðîãðàììû
		
		System.out.print("\n     Ââåäèòå ïåðâîå ÷èñëî: ");

		a=Double.parseDouble(br.readLine());

		System.out.print("\n     Ââåäèòå âòîðîå ÷èñëî: ");

		b=Double.parseDouble(br.readLine());

		System.out.println("\n       1 - ñëîæåíèå");
		System.out.println("       2 - âû÷èòàíèå");
		System.out.println("       3 - óìíîæåíèå");		
		System.out.println("       4 - äåëåíèå");		
				
		// Åñëè ïîëüçîâàòåëü ââîäèò íåêîððåêòíîå çíà÷åíèå âûáîðà
		// òî ñîîáùàåì åìó ïðî îøèáêó è ïîâòîðÿåì çàïðîñ
		do{
			System.out.print("\n     Âûáåðèòå äåéñòâèå : ");
			act=Integer.parseInt(br.readLine());
			if (act < 1 || act > 4) System.out.println(" \n      ERROR ! ! !");	
		}while ( act < 1 || act > 4 );
		    
			Calculator.a1 = a;
			Calculator.b1 = b;
			// îáðàùàåìñÿ ê êëàññó calc äëÿ ïðîâåäåíèÿ âû÷èñëåíèé 
			switch(act) {
				case 1:
					res = Calculator.sum();
					System.out.print("\n   Ðåçóëüòàò: " + res + "\n");
					break;
				case 2:
					res = Calculator.sub();
					System.out.print("\n   Ðåçóëüòàò: " + res + "\n");					
					break;
				case 3:
					res = Calculator.mul();
					System.out.print("\n   Ðåçóëüòàò: " + res + "\n");
					break;
				case 4:
					res = Calculator.div();
					System.out.print("\n   Ðåçóëüòàò: " + res + "\n");
					break;
			}
		
		
		
		System.out.print("\n     Ïîâòîðèòü âûïîëíåíèå ïðîãðàììû? (1 - ÄÀ, 0 - ÍÅÒ) : ");
		
			repeat=Integer.parseInt(br.readLine());
			if (repeat < 0 || repeat > 1) System.out.println(" \n      ERROR ! ! !");	// åñëè ïîëüçîâàòåëü ââîäèò ÷åòîíåòî, ñîîáùàåì ïðî îøèáêó
		
		
		
		}while ( repeat == 1  );
		
		
		}
	}

		class Calc {
			    
			double a1, b1; // èíèöèàëèçàöèÿ ïåðåìåííûõ âíóòðè êëàññà Calc
			
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
