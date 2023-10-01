package manav;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat;
		double armut, elma, domates, muz, patlican;
		
		armutFiyat = 2.14;
		elmaFiyat = 3.67;
		domatesFiyat = 1.11;
		muzFiyat = 0.95;
		patlicanFiyat = 5.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo: ");
		armut = scan.nextDouble();
		
		System.out.print("Elma kaç kilo: ");
		elma = scan.nextDouble();
		
		System.out.print("Domates kaç kilo: ");
		domates = scan.nextDouble();
		
		System.out.print("Muz kaç kilo: ");
		muz = scan.nextDouble();
		
		System.out.print("Patlıcan kaç kilo: ");
		patlican = scan.nextDouble();
		
		double toplam = (armutFiyat * armut) + (elmaFiyat*elma)+(domatesFiyat * domates)+ (muzFiyat*muz)+ (patlicanFiyat*patlican);
		
		System.out.println("Sepet tutarı: "+ toplam);
		
		
		
	}

}
