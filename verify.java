import java.util.ArrayList;

public class verify {
	
	public String verfy(String m ,char j,String n ) 
	{	
		char k []= m.toCharArray();
		ArrayList<Integer> l = new ArrayList<>();
			
		for (int i =0; i< k.length;i++) 
		{
			if (Character.toLowerCase(k[i])==Character.toLowerCase(j)) 
			{
				l.add(i);
			}
		
		}
		k = n.toCharArray();
		for (int i = 0; i<l.size();i++) 
		{
			k[l.get(i)]=j;
		}
		
		
		return String.valueOf(k);
		
		
	}
	
	public String spc ( String m) 
	{	
		char[] z= m.toCharArray();
		for (int i =0; i<z.length;i++) {
			if (z[i]!=' ') {
				z[i]= '-';
			}
			
		}
		return String.valueOf(z);
		
	}
	
	
	
}
