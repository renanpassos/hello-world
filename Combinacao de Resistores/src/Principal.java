import java.util.ArrayList;

public class Principal {

	final static float [] serieE12 = {10, 12, 15, 18, 22, 27, 33, 39, 47, 56, 68, 82, 100, 120, 150, 180, 220, 270, 330, 390, 470, 560};  
	final static float razaoIdeal1 = (float) (0.5/5.0);
	final static float razaoIdeal2 = (float) (1.2/5.0);
	final static float tolerancia = (float) 0.04;	

	public static void main(String[] args) {
		for (int i=0 ; i<22 ; i++) {
			for (int j=0 ; j<22 ; j++) {
				for (int k=0 ; k<22 ; k++) {
					float soma = serieE12[i] + serieE12[j] + serieE12[k];
					float val1 = (serieE12[i]/soma) / razaoIdeal1;
					float val2 = (serieE12[k]/soma) / razaoIdeal2;
					
					if ( (1 - tolerancia) <= val1 && val1 <= (1 + tolerancia)
					  && (1 - tolerancia) <= val2 && val2 <= (1 + tolerancia) ) {
						System.out.print(serieE12[i]);
						System.out.print(" ; ");
						System.out.print(serieE12[j]);
						System.out.print(" ; ");
						System.out.print(serieE12[k]);
						System.out.print(" | ");
						System.out.print(val1);
						System.out.print(" ; ");
						System.out.print(val2);
						System.out.print(" ; ");
						System.out.print(soma);
						System.out.println(" ohm");
					}
				}
			}
		}
	}
	
}
