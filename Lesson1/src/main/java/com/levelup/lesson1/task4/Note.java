		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.Scanner;
		
		class Note{
				
			public static void main(String args []) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			String NoteArray[];
			int action, repeat;
		
			// Инициализируем стринговый массив размерностью 5 для хранения данных блокнота
 			NoteArray = new String[10];
			
			do {                 // МЕНЮ БЛОКНОТА.
			System.out.println();	
			System.out.println("         Блокнот\n");	
			System.out.print(" Выберите действие (1 - add, 2 - show, 3 - edit, 4 - delete ):  ");
			
			//  ВВОД ЦИФРЫ КАК ВЫБОР ДЕЙСТВИЯ МЕНЮ
			action= Integer.parseInt(br.readLine());
			
			switch(action) {
				case 1:
					AddNote Add = new AddNote();
					Add.NoteInClass = NoteArray;
					Add.add();
					break;
				case 2:
					AddNote ShowNote = new AddNote();
					ShowNote.NoteInClass = NoteArray;
					ShowNote.showNote();				
					break;
				case 3:
					AddNote Edit = new AddNote();
					Edit.NoteInClass = NoteArray;
					Edit.edit();							
					break;
					
				case 4:
					AddNote Delete = new AddNote();
					Delete.NoteInClass = NoteArray;
					Delete.delete();				
					break;
			}
							
			System.out.print("\n     Повторить выполнение программы? (1 - ДА, 0 - НЕТ) : ");
			repeat = Integer.parseInt(br.readLine());
			}while (repeat == 1);
		}
	}
		
		class AddNote{
		String NoteInClass[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr = new Scanner(System.in,"IBM866");
		
		
			//Реализация записи строки в ячейки массива с помошью оператора switch
			void add()throws IOException {
			int memorycase;
			System.out.print("\n  Выберите ячейку памяти блокнота (от 0 до 4):  ");
			memorycase = Integer.parseInt(br.readLine());
				switch(memorycase) {
				case 0:
				System.out.print("\n   Сделайте запись:  ");
				NoteInClass[0] = scr.nextLine();
				System.out.println("\n     Запись успешна!");
				break;
				case 1:
				System.out.print("\n   Сделайте запись:  ");
				NoteInClass[1] = scr.nextLine();
				System.out.println("\n     Запись успешна!");
				break;
				case 2:
				System.out.print("\n   Сделайте запись:  ");
				NoteInClass[2] = scr.nextLine();
				System.out.println("\n     Запись успешна!");
				break;
				case 3:
				System.out.print("\n   Сделайте запись:  ");
				NoteInClass[3] = scr.nextLine();
				System.out.println("\n     Запись успешна!");
				break;
				case 4:
				System.out.print("\n   Сделайте запись:  ");
				NoteInClass[4] = scr.nextLine();
				System.out.println("\n     Запись успешна!");
				break;
				}
			}
			
			void edit()throws IOException{
			int memorycase;
			System.out.print("\n  Какую ячейку памяти редактировать? (от 0 до 4):  ");
			memorycase = Integer.parseInt(br.readLine());
			
			//Выходим из метода, если ячейка массива пуста!
			if (NoteInClass[memorycase] == null){
				System.out.println("\n Ячейка памяти пуста! ");
				return;
				}
			System.out.println("\n  Значение в ячейке " + memorycase + " :  " + NoteInClass[memorycase]);
			System.out.print("\n  Введите новое значение: ");
			NoteInClass[memorycase] = scr.nextLine();
			System.out.println("\n  Изменение сохранено успешно! ");
				}
			
			void delete()throws IOException {
				int memorycase;
				System.out.print("\n  Какую ячейку памяти очистить? (от 0 до 4):  ");
				memorycase = Integer.parseInt(br.readLine());
				
				switch(memorycase) {
				case 0:
				
				NoteInClass[0] = null;
				System.out.println("\n     Ячейка очищена!");
				break;
				case 1:
				
				NoteInClass[1] = null;
				System.out.println("\n     Ячейка очищена!");
				break;
				case 2:
				
				NoteInClass[2] = null;
				System.out.println("\n     Ячейка очищена!");
				break;
				case 3:
				
				NoteInClass[3] = null;
				System.out.println("\n     Ячейка очищена!");
				break;
				case 4:
				
				NoteInClass[4] = null;
				System.out.println("\n     Ячейка очищена!");
				break;
				}
				
				
				
				}
			
			void showNote(){
						System.out.println();	
						for (int i = 0; i < 5; i++)
			
						System.out.println(" " + i + "  >>  " + NoteInClass[i] + "  " + "\n");
				}
		}
				
		
			//Scanner scr = new Scanner(System.in,"IBM866"); // Указали кодировку для считывания КИРИЛЛИЦЫ
			//NoteInClass[0] = scr.nextLine(); // записали строку в массив		
		