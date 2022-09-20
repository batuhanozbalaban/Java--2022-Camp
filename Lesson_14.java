package intro;

public class Lesson_14 {

	public static void main(String[] args) {

		//Arrays
		
		String ogrenci1 = "Batuhan";
		String ogrenci2 = "Ayça";
		String ogrenci3 = "Özlem";
		
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		
		
		System.out.println("-------------------");
		
		
		String[] ogrenciler = new String [4];
		ogrenciler[0]="Batuhan";
		ogrenciler[1]="Ayça";
		ogrenciler[2]="Özlem";
		ogrenciler[3]="Necmi";
		
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		} 
		
		
		System.out.println("-------------------");
		
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
		
		
		
		
	}

}
