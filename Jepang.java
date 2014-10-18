class Jepang{
	String Makanan;
	String Pakaian;
	String Bunga;
	String Senjata;
	
	
	
	//Atribut
	public String getMakanan(){
		return Makanan;
	}
	public void setMakanan(String a){
		this.Makanan=a;
	}
	
	public String getPakaian(){
		return Pakaian;
	}
	public void setPakaian(String b){
		this.Pakaian=b;
	}
	
	public String getBunga(){
		return Bunga;
	}
	public void setBunga(String c){
		this.Bunga=c;
	}
	
	public String getSenjata(){
		return Senjata;
	}
	public void setSenjata(String d){
		this.Senjata=d;
	}
	
	public static void main(String [] args){
		Jepang makananPertama = new Jepang();
		makananPertama.setMakanan("Sushi");
		System.out.print("Salah Satu Makanan Asal Jepang Adalah: ");
		System.out.println(makananPertama.getMakanan());
	
		makananPertama.setPakaian("Kimono");
		System.out.print("Pakaian Asal Jepang Adalah: ");
		System.out.println(makananPertama.getPakaian());
		
		makananPertama.setBunga("Sakura");
		System.out.print("Bunga Asal Jepang Adalah: ");
		System.out.println(makananPertama.getBunga());
		
		makananPertama.setSenjata("Katana");
		System.out.print("Senjata Asal Jepang Adalah: ");
		System.out.println(makananPertama.getSenjata());
	}
}


