package kampIntro1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "internet subesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar dustu resmi");
		}else {
			System.out.println("Dolar yukseldi resmi");
		}
		
		String[] krediler = {"Hizli kredi","Mutlu emekli kredisi","Konut kredisi","Ciftci kredisi","Msb kredisi","Meb kredisi"};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar1[0] = 101;
		System.out.println(sayilar2[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "?stanbul";
		sehir1 = sehir2;
		sehir2 = "?zmir";
		System.out.println(sehir1);
		
		
		
	}

}
