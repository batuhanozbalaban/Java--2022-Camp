package intro;

public class Main {

	
	public static void main(String[] args) {
	System.out.println("Hello World!");	
	
	//Değişken isimlendirmeleri javada camelCase yazılır.
	
	String ortaMetin = "İlginizi çekebilir";
	String altMetin = "Vade Süresi";
	

	System.out.println(ortaMetin);
	System.out.println(altMetin);
	
	//integer = tam sayı
	int vade = 12;
	
	
	
	//odanlıklı sayı için double, float kullanılabilir.
	
	double dolarDun = 18.25;
	double dolarBugun = 18.30;
	
	boolean dolarDustuMu = false;
	
	String okYonu="";
	
	if (dolarBugun<dolarDun) {
		okYonu="down.svg";
		System.out.println(okYonu);
	}
		else if (dolarBugun>dolarDun) {
		okYonu="up.svg";
		System.out.println(okYonu);

	}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);

		}
	
	//array
	
	String[] krediler = {"Hızlı Kredi", "Maaşı Halkbanktan", "Mutlu Emekli"};
	
		
	for (int i = 0; i < krediler.length; i++) {
		System.out.println(krediler[i]);
	}
	}

}
