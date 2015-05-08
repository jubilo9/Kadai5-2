package junit.eng;
import java.util.Scanner;

public class IntToEng {


	    // ���C�����\�b�h
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    // ���l���p�󂷂�ϊ����郁�\�b�h
	    static String translateEng(int n) {
	    	String []eng1={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twenteen","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
	    	String []eng2={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    	String ans = "";
	    	String ans2 = "";
	    	if(n<20) return eng1[n];
	    	else {
	    		String c = String.valueOf(n);
	    		int l = c.length();
	    		int a = Integer.parseInt(c.substring(l-2,l));
	    		int nu = 0;
	    		if(a<20) ans2=eng1[a];
	    		else {
	    			ans = eng2[Integer.parseInt(String.valueOf(c.charAt(0)))];
	    			nu = Integer.parseInt(String.valueOf(c.charAt(1))) ;
	    			if(nu > 0){
	    				ans += " " + eng1[nu];
	    			};
	    		}
	    		return ans;
	    	}
	    }
	}


