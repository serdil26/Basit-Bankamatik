package bankamatik;

import java.util.Scanner;

public class Bankamatik {

	public static void main(String[] args) {
		System.out.println("***ATM'ye Hosgeldiniz***");
		Scanner scan=new Scanner(System.in);
		String islem="1.islem: BAKIYE \n2.islem: PARA CEKME \n3.islem: PARA YATIRMA \n4.islem: CIKIS";
		
		System.out.println(islem);
		System.out.println("Yapmak istediginiz islemi seciniz;");
		
		int bakiye= 5000;
		String secilenIslem=scan.nextLine();
		
		switch (secilenIslem) {
		case "1":
			System.out.println("Bakiyeniz :" + bakiye);
			break;
case "2":
			System.out.println("Cekmek istediginiz miktari giriniz");
			int cekilecekMiktar= scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("Kalan bakiyeniz: "+ bakiye);
			}else {
				System.out.println("Yeterli bakiyeniz bulunmamaktadir");
			}
			break;
case "3":
	System.out.println("Yatirmak istediginiz miktari giriniz");
	int yatirilacakMiktar= scan.nextInt();
	bakiye+=yatirilacakMiktar;
	System.out.println("Yeni bakiyeniz: " + bakiye);
	break;
case "4":
	System.out.println("Cikis isleminiz basariyla gerceklestirildi");
	break;

		default: 
			System.out.println("Hatali giris yaptiniz");
			break;
		}
		scan.close();
		}
		
		

	}


