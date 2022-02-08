package package02;

public class Expre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=5;
		int z=0;
		boolean b1=true;
		boolean b2=false;
		if(x==2) {
			System.out.println(b1);
		}
		if(x!=5) {
			System.out.println(b1);
		}
		if(x!=5 && y>=5) {
			System.out.println(b1);
		}
		if(z!=0 || x==2) {
			System.out.println(b1);
		}
		if(!(y<10)) {
			System.out.println(b1);
		}
		else {
			System.out.println(b2);
		}
	}

}
