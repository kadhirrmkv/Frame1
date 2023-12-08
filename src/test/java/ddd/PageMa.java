package ddd;

public class PageMa {
	
	
	private FirstPage fp;
	
	public FirstPage getFp(){
		if(fp==null) {
			fp=new FirstPage();
		}
		return fp;
	}

	
	private SecondPage sp;
	
	public SecondPage getSp() {
		if(sp==null) {
			sp=new SecondPage();
		}
		return sp;
	}

	
	
	

}
