package Average;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, muzik;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: "); 
		mat = inp.nextInt();
		System.out.print("Fizik Notunuz: "); 
		fizik = inp.nextInt();
		System.out.print("Kimya Notunuz: "); 
		kimya = inp.nextInt();
		System.out.print("Türkçe Notunuz: "); 
		turkce = inp.nextInt();
		System.out.print("Müzik Notunuz: "); 
		muzik = inp.nextInt();
		
		int total = 0;
		int toplamDers = 0;
		double average ;
		boolean gecerlilik = false;
		
		if ((0 <= mat) && (mat <= 100) ) 
		{
			total += mat;
			++toplamDers;
		}
		else 
		{
			gecerlilik = true;
			System.out.println("Matematik notunu hatalı girdiniz!");
		};
		
		if ((0 <= fizik) && (fizik <= 100) ) 
		{
			total += fizik;
			++toplamDers;
		}
		else 
		{
			gecerlilik = true;
			System.out.println("Fizik notunu hatalı girdiniz!");
		};
		
		if ((0 <= kimya) && (kimya <= 100) ) 
		{
			total += kimya;
			++toplamDers;
		}
		else 
		{
			gecerlilik = true;
			System.out.println("Kimya notunu hatalı girdiniz!");
		};
		
		if ((0 <= turkce) && (turkce <= 100) ) 
		{
			total += turkce;
			++toplamDers;
		}
		else 
		{
			gecerlilik = true;
			System.out.println("Türkçe notunu hatalı girdiniz!");
		};
		
		if ((0 <= muzik) && (muzik <= 100) ) 
		{
			total += muzik;
			++toplamDers;
		}
		else 
		{
			gecerlilik = true;
			System.out.println("Müzik notunu hatalı girdiniz!");
		};
		
		
		
		if  ((gecerlilik == false) || (gecerlilik == true && toplamDers != 0) )
		{
			average = total / toplamDers;
			if (average <= 55) 
			{
				System.out.println("Ortalamanız: " + average + "\nSınıfta Kaldınız. Seneye başarılar...");
			}else 
			{
				System.out.println("Ortalamanız: " + average + "\nSınıfı Geçtiniz.Tebrikler......");
			}
		}
		else if (toplamDers == 0) 
		{
			System.out.println("Bütün notlarınızı geçersiz girdiniz.\nLütfen 0 ile 100 arasında bir tam sayı giriniz");
		}
		
		
		
		

		
		
		
		
				
	}

}
