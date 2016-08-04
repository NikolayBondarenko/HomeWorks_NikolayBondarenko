		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.Scanner;
		
		class Note{
				
			public static void main(String args []) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			String NoteArray[];
			int action, repeat;
		
			// �������������� ���������� ������ ������������ 5 ��� �������� ������ ��������
 			NoteArray = new String[10];
			
			do {                 // ���� ��������.
			System.out.println();	
			System.out.println("         �������\n");	
			System.out.print(" �������� �������� (1 - add, 2 - show, 3 - edit, 4 - delete ):  ");
			
			//  ���� ����� ��� ����� �������� ����
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
							
			System.out.print("\n     ��������� ���������� ���������? (1 - ��, 0 - ���) : ");
			repeat = Integer.parseInt(br.readLine());
			}while (repeat == 1);
		}
	}
		
		class AddNote{
		String NoteInClass[];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr = new Scanner(System.in,"IBM866");
		
		
			//���������� ������ ������ � ������ ������� � ������� ��������� switch
			void add()throws IOException {
			int memorycase;
			System.out.print("\n  �������� ������ ������ �������� (�� 0 �� 4):  ");
			memorycase = Integer.parseInt(br.readLine());
				switch(memorycase) {
				case 0:
				System.out.print("\n   �������� ������:  ");
				NoteInClass[0] = scr.nextLine();
				System.out.println("\n     ������ �������!");
				break;
				case 1:
				System.out.print("\n   �������� ������:  ");
				NoteInClass[1] = scr.nextLine();
				System.out.println("\n     ������ �������!");
				break;
				case 2:
				System.out.print("\n   �������� ������:  ");
				NoteInClass[2] = scr.nextLine();
				System.out.println("\n     ������ �������!");
				break;
				case 3:
				System.out.print("\n   �������� ������:  ");
				NoteInClass[3] = scr.nextLine();
				System.out.println("\n     ������ �������!");
				break;
				case 4:
				System.out.print("\n   �������� ������:  ");
				NoteInClass[4] = scr.nextLine();
				System.out.println("\n     ������ �������!");
				break;
				}
			}
			
			void edit()throws IOException{
			int memorycase;
			System.out.print("\n  ����� ������ ������ �������������? (�� 0 �� 4):  ");
			memorycase = Integer.parseInt(br.readLine());
			
			//������� �� ������, ���� ������ ������� �����!
			if (NoteInClass[memorycase] == null){
				System.out.println("\n ������ ������ �����! ");
				return;
				}
			System.out.println("\n  �������� � ������ " + memorycase + " :  " + NoteInClass[memorycase]);
			System.out.print("\n  ������� ����� ��������: ");
			NoteInClass[memorycase] = scr.nextLine();
			System.out.println("\n  ��������� ��������� �������! ");
				}
			
			void delete()throws IOException {
				int memorycase;
				System.out.print("\n  ����� ������ ������ ��������? (�� 0 �� 4):  ");
				memorycase = Integer.parseInt(br.readLine());
				
				switch(memorycase) {
				case 0:
				
				NoteInClass[0] = null;
				System.out.println("\n     ������ �������!");
				break;
				case 1:
				
				NoteInClass[1] = null;
				System.out.println("\n     ������ �������!");
				break;
				case 2:
				
				NoteInClass[2] = null;
				System.out.println("\n     ������ �������!");
				break;
				case 3:
				
				NoteInClass[3] = null;
				System.out.println("\n     ������ �������!");
				break;
				case 4:
				
				NoteInClass[4] = null;
				System.out.println("\n     ������ �������!");
				break;
				}
				
				
				
				}
			
			void showNote(){
						System.out.println();	
						for (int i = 0; i < 5; i++)
			
						System.out.println(" " + i + "  >>  " + NoteInClass[i] + "  " + "\n");
				}
		}
				
		
			//Scanner scr = new Scanner(System.in,"IBM866"); // ������� ��������� ��� ���������� ���������
			//NoteInClass[0] = scr.nextLine(); // �������� ������ � ������		
		