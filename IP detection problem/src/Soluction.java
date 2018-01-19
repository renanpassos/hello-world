import java.util.Scanner;

public class Soluction {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new RegexOfIP().pattern));
        }
        in.close();

    }
	
 
	
}

class RegexOfIP {
	public RegexOfIP() {
	}
	String pattern = new String(
			  "([0-9]([0-9])??|1[0-9][0-9]|2([0-4][0-9]|5[0-5]))."
			+ "([0-9]([0-9])??|1[0-9][0-9]|2([0-4][0-9]|5[0-5]))."
			+ "([0-9]([0-9])??|1[0-9][0-9]|2([0-4][0-9]|5[0-5]))."
			+ "([0-9]([0-9])??|1[0-9][0-9]|2([0-4][0-9]|5[0-5]))");
}