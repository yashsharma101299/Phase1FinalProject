package main_code;

public class hll {

	public static void main(String[] args) {
		int i=0,j=0;
		
		while(i<5) 
		{innerloop:
			while(j<5) 
			{System.out.println("j");
			j++;
			if(j==3)
				break;}
		System.err.println("i");
		i++;
		}

	}

}
