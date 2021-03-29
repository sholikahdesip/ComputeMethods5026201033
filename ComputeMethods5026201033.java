import java.util.Scanner;
public class ComputeMethods5026201033 {
	static double a,b,
	Celcius;
	static String F;
	
		public static void main(String[] args) {
		
			ComputeMethods5026201033 ks = new ComputeMethods5026201033();
			
			System.out.println("masukkan nilai suhu dalam Fahrenheit:");
			Scanner s = new Scanner (System.in);
			F = s.next();//menangkap nilai fahrenheit
			a=Double.parseDouble (F);//merubah nilai f yang String menjadi double
			
			ks.konversi();
			ks.cetak();
			
			}
			void cetak() {
				System.out.println("");
				System.out.println(a+" F =");
				System.out.println(Celcius +" C");
			}
			void konversi() {
			Celcius = (a - 32) * 5/9;
			
			Scanner s = new Scanner(System.in);
		
			int a,b,c;
		
			System.out.println("menghitung panjang sisi miring segitiga siku-siku:");
			System.out.println("masukkan nilai a: ");
			a = s.nextInt();
			System.out.println("masukkan nilai b: ");
			b = s.nextInt();
			c = ((a * a) + (b * b));
			System.out.println("panjang sisi miring segitiga siku-siku adalah = " + (Math.sqrt(c)));
				
			int dadu1;
			int dadu2;
			int hasilLemparan;
		
			dadu1 = (int)(Math.random()*6) + 1;
			dadu2 = (int)(Math.random()*6) + 1;
			hasilLemparan = dadu1 + dadu2;
		
			System.out.println("Angka pada Dadu Pertama= " + dadu1);
			System.out.println("Angka pada Dadu Kedua= " + dadu2);
			System.out.println("Total Angka Dadu= " + hasilLemparan);
		}
}