class Biscuit{
	String nameOfBiscult="Good Day";
	double price=20;
	String mfgDate;
	String dateOfExpiry; 
	Biscuit(){
		System.out.println("Biscult");
	}
	public static void main(String[] args){
		Biscuit ref=new Biscuit();
		System.out.println("Name: "+ref.nameOfBiscult);
		System.out.println("Price: "+ref.price);
		System.out.println("MFD: "+ref.mfgDate);
		System.out.println("EXD: "+ref.dateOfExpiry);
	}
}
