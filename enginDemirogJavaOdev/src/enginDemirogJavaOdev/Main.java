package enginDemirogJavaOdev;

public class Main {

	public static void main(String[] args) {
		// en b�y�k say�y� bulma

		int number1 = 18;
		int number2 = 45;
		int number3 = 27;
		int biggestNumber = number1;

		if (biggestNumber < number2) {
			biggestNumber = number2;
		}
		if (biggestNumber < number3) {
			biggestNumber = number3;
		}

		System.out.println("En b�y�k say�: " + biggestNumber);

		System.out.println("****************************************");

		// Dersi ge�ip ge�meme durumu �rne�i switch blok
		char grade = 'C';
		switch (grade) {
		case 'A', 'B', 'C':
			System.out.println("Tebrikler, s�n�f� ge�tiniz: :)");
			break;
		case 'D':
			System.out.println("Dersi �artl� ge�tiniz. :|");
			break;
		case 'F':
		System.out.println("�zg�n�z, dersten kald�n�z. :(");
		break;
		default:
			System.out.println("Ge�ersiz bir ifade girdiniz.");
		

		}
		
		System.out.println("********************");
		
		
		
		
		
		
		//diziler
		
		double[] numbers= {1.3,12.4,5.6};
		double max=numbers[0];
		double total=0;
		
		
		for(double number:numbers) {
			if(max<number) {
				max=number;
			
			}
			total=total+number;
		
			System.out.println(number);
		}
		System.out.println("Toplam:" + total);
		
		System.out.println("En b�y�k say�: " + max);
		
		
		System.out.println("*******************");
		
		
		
		
		
		
		//ASAL SAYI �RNE��
		int number=11;
		boolean isPrime=true;
		

		if(number<=1) {
			System.out.println("Ge�ersiz bir ifade girdiniz.");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("Bu say� asald�r.");
		}
		else {
			System.out.println("Bu say� asal de�ildir.");
		}
	
		
		
		
		
		System.out.println("******************");
		
//KALIN �NCE SESL� HARF �RNE��
		char harf='A';
		
		switch(harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kal�n sesli harf");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println("�nce sesli harf");
			break;
			default:
				System.out.println("Ge�ersiz ifade");
			
		}
		
		System.out.println("*******************");
		//M�kemmel say� �rne�i
		
		int perfect=7;
		int total2=0;
		
		for(int i=1; i<perfect; i++) {
			if(perfect%i==0) {
				total=total+i;
			}
			
		}
		if(total==perfect) {
			System.out.println("Say� m�kemmledir");
		}
		else {
			System.out.println("Say� m�kemmel de�ildir.");
		}
		
		System.out.println("*******************");
		
		//Dizilerde say� bulmaca
		
		
		int aranacak=36;
		int[] sayilar= {1,3,6,7,9,11,89,3};
		boolean isHere=false;
		
		for(int sayi:sayilar) {
			if(aranacak==sayi) {
				isHere=true;
				break;
			}
		}
		if(isHere) {
			System.out.println("Say� vard�r");
		}
		else {
			System.out.println("Say� yoktur");
		}
		
		
		
		

	}
}
