package ForMe;

public class useOfSplitMethod {
	public static void main(String[] args) {
		//String s="my name is Bhagyashree";
		String name="My name is bhagyashree bhor";
		//name=name.toLowerCase();
		String ar[]=null;
		String kk="";
		ar=name.split(" ");
		for(int i=0;i<ar.length;i++) {
			
			String pp=ar[i].substring(0, 1).toUpperCase()+ar[i].substring(1);
			kk=kk+" "+pp;
			
			
		}
		kk=kk.substring(1);
		System.out.println(kk);
	}

	
}
