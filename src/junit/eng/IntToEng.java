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
	    	String ans3 = "";
	    	
	    	if(n<20) return eng1[n];
	    	if(n<1000&&n%100==0) return eng1[n/100]+" hundred";
	    	if(n<10000&&n%1000==0) return eng1[n/1000] + " thousand";
	    	if(n==10000) return "ten thousand";
	    	if(n<1000000&&n%100000==0) return eng1[n/100000] + " hundred thousand";
	    	if(n<100000&&n%10000==0) return eng2[n/10000] + " thousand";

	    	else {
	    		String c = String.valueOf(n);
	    		int l = c.length();
	    		int a = Integer.parseInt(c.substring(l-2,l));
	    		int nu = 0;
	    		if(a<=0) ;
	    		else if(a<20) ans=eng1[a];
	    		else {
	    			String a2 =  String.valueOf(a);
	    			ans = eng2[Integer.parseInt(String.valueOf(a2.charAt(0)))];
	    			nu = Integer.parseInt(String.valueOf(a2.charAt(1))) ;
	    			if(nu > 0){
	    				ans += " " + eng1[nu];
	    			};
	    		}
	    		int t=0;
	    		if(n>100000){
	    			t =n/100000;
	    			ans3 = eng1[t] + " hundred " ;
	    			
	    		}
	    		int m = n-(t*100000);
	    		if(m>1000){
	    			t = m/1000;
	    			if(t<20)ans2 = eng1[t] + " thousand ";
	    			else if(t>=20 && t<=99){
	    				String a2 =  String.valueOf(t);
		    			ans2 = eng2[Integer.parseInt(String.valueOf(a2.charAt(0)))];
		    			nu = Integer.parseInt(String.valueOf(a2.charAt(1))) ;
		    			if(nu > 0){
		    				ans2 += " " + eng1[nu]+" thousand ";
		    			}
		    			else {ans2 += " thousand ";}
	    			}
	    		}
	    		else if(n>1000){ans2 += "thousand ";}
	    		int h = m;
	    		if(m>=1000) h = m-(t*1000);
	    		if(h >= 100){
	    			nu = h/100;
	    			if(nu>0){
	    				ans = ans2 + eng1[nu] +" hundred "+ans;
	    			}
	    		}
	    		else { ans = ans2 + ans; }
	    		
	    		ans = ans3+ans;
	    		
	    		
	    		return ans.trim();
	    		//return "ans3=" + ans3 + " ans2="+ans2+"ans="+ans+" m=" + m;

	    	}
	    }
	}


