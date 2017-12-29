public class AoCInverseCaptcha {
	public static void main(String[] args){
		int result = 0;	
		int[] captcha = new int[args.length];
		
		for(int i = 0; i< args.length;i++){
			captcha[i] = Integer.parseInt(args[i]); 
		}

		System.out.println(captcha);
		
		for (int i=0;i<captcha.length;i++){
			
			if (i < captcha.length-1){
				if(captcha[i] == captcha[i+1]){
					result += captcha[i];
				}
			}
		}	
		
		
		if (captcha[0] == captcha[captcha.length-1]){
				result += captcha[0];
		}
		
		System.out.println("Resultado " + result);
	
	
	}
}
