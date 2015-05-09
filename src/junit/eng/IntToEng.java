package junit.eng;
import java.util.Scanner;

public class IntToEng {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    static String translateEng(int n) {
	    	String []eng1={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};
	    	String []eng2={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	    	String ans = "";
	    	String ans2 = "";
	    	
	    	if(n<20) return eng1[n];
	    	if(n<1000&&n%100==0) return eng1[n/100]+" hundred";
	    	if(n%1000==0) return eng1[n/1000] + " thousand";
	    	else {
	    		String c = String.valueOf(n);
	    		int l = c.length();
	    		int a = Integer.parseInt(c.substring(l-2,l));
	    		int nu = 0;
	    		if(a<20) ans=eng1[a];
	    		else {
	    			String a2 =  String.valueOf(a);
	    			ans = eng2[Integer.parseInt(String.valueOf(a2.charAt(0)))];
	    			nu = Integer.parseInt(String.valueOf(a2.charAt(1))) ;
	    			if(nu > 0){
	    				ans += " " + eng1[nu];
	    			};
	    		}
	    		int t=0;
	    		if(n>1000){
	    			t = n/1000;
	    			ans2 = eng1[t] + " thousand ";
	    		}
	    		int h = n-(t*1000);
	    		if(h >= 100){
	    			ans = ans2 + eng1[h/100] +" hundred "+ans;
	    		}
	    		else { ans = ans2 + ans; }
	    		
	    		
	    		return ans;
	    	}
	    }
	}


