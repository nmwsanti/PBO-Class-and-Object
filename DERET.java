import java.util.Scanner;
public class DERET {
	int a, b, n;
	Scanner scan = new Scanner(System.in);
	
	DERET(){
		System.out.print("Input nilai awal: ");
		a = scan.nextInt();
		System.lineSeparator();
		
		System.out.print("Input beda: ");
		b = scan.nextInt();
		System.lineSeparator();
		
		System.out.print("Input Jumlah Deret: ");
		n = scan.nextInt();
		System.lineSeparator();		
	}
	
	void arithPro() {
		int temp;
		temp = a;
		for(int i = 1; i <= n; i++) {
			System.out.print(temp + " ");
			temp = temp + b;
		}
	}
	
	
	public static void main(String[] args) {
		DERET obj = new DERET();
		obj.arithPro();

	}

}