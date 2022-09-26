package enginDemirogJavaOdev;

public class Main {

	public static void main(String[] args) {
		// en büyük sayıyı bulma

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

		System.out.println("En büyük sayı: " + biggestNumber);

		System.out.println("****************************************");

		// Dersi geçip geçmeme durumu örneği switch blok
		char grade = 'C';
		switch (grade) {
		case 'A', 'B', 'C':
			System.out.println("Tebrikler, sınıfı geçtiniz: :)");
			break;
		case 'D':
			System.out.println("Dersi şartlı geçtiniz. :|");
			break;
		case 'F':
		System.out.println("Üzgünüz, dersten kaldınız. :(");
		break;
		default:
			System.out.println("Geçersiz bir ifade girdiniz.");
		

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
		
		System.out.println("En büyük sayı: " + max);
		
		
		System.out.println("*******************");
		
		
		
		
		
		
		//ASAL SAYI ÖRNEĞİ
		int number=11;
		boolean isPrime=true;
		

		if(number<=1) {
			System.out.println("Geçersiz bir ifade girdiniz.");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("Bu sayı asaldır.");
		}
		else {
			System.out.println("Bu sayı asal değildir.");
		}
	
		
		
		
		
		System.out.println("******************");
		
//KALIN İNCE SESLİ HARF ÖRNEĞİ
		char harf='A';
		
		switch(harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'Ö':
		case 'Ü':
		case 'İ':
			System.out.println("İnce sesli harf");
			break;
			default:
				System.out.println("Geçersiz ifade");
			
		}
		
		System.out.println("*******************");
		//Mükemmel sayı örneği
		
		int perfect=7;
		int total2=0;
		
		for(int i=1; i<perfect; i++) {
			if(perfect%i==0) {
				total=total+i;
			}
			
		}
		if(total==perfect) {
			System.out.println("Sayı mükemmledir");
		}
		else {
			System.out.println("Sayı mükemmel değildir.");
		}
		
		System.out.println("*******************");
		
		//Dizilerde sayı bulmaca
		
		
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
			System.out.println("Sayı vardır");
		}
		else {
			System.out.println("Sayı yoktur");
		}
		
		
		
		

	}
}
