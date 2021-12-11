import java.util.Scanner;

public class HargaBaju {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int harga = 0;
		String jenis;
        System.out.print("Nama :");
        jenis = input.next();
        
        System.out.print("pilihan:\n 1.Oversize \n 2.Kemeja\n 3.Turtleneck\n 4.T-Shirt\n 5.Batik\n");
        System.out.print("masukan jenis baju : ");
		Scanner masukan =new Scanner(System.in);
		harga = masukan.nextInt();
		
		
		switch (harga) {
		case 1 :
			System.out.println("Oversize=IDR150000");
			break;
		case 2 :
			System.out.println("Kemeja=IDR120000");
			break;
		case 3 :
			System.out.println("TurtleNeck=IDR200000");
			break;
		case 4 :
			System.out.println("T-Shirt=IDR75000");
			break;
		case 5 :
			System.out.println("Batik=IDR130000");
			break;
		default:
            System.out.println("Salah Pilih ! :(");
		}
	}
	
}

