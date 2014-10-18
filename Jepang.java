class Jepang{ //nama kelas
//mendeklarasikan variabel
	String Makanan; //mendeklarasikan variabel Makanan dengan tipe data string
	String Pakaian; //mendeklarasikan variabel Pakaian dengan tipe data string
	String Bunga; //mendeklarasikan variabel Bunga dengan tipe data string
	String Senjata; //mendeklarasikan variabel Senjata dengan tipe data string

	
	//Atribut
	public String getMakanan(){ //menginisialisasi nilai Makanan
		return Makanan; //mengembalikan nilai makanan
	}
	public void setMakanan(String a){ //mendeklarasikan set untuk atribut makanan
		this.Makanan=a;
	}
	
	public String getPakaian(){ //menginisialisasi nilai Pakaian
		return Pakaian; //mengembalikan nilai Pakaian

	}
	public void setPakaian(String b){ //mendeklarasikan set untuk atribut Pakaian
		this.Pakaian=b;
	}
	
	public String getBunga(){ //menginisialisasi nilai Bunga
		return Bunga; //mengembalikan nilai Bunga
	}
	public void setBunga(String c){ //mendeklarasikan set untuk atribut Bunga
		this.Bunga=c;
	}
	
	public String getSenjata(){ //menginisialisasi nilai Senjata
		return Senjata; //mengembalikan nilai Senjata
	}
	public void setSenjata(String d){ //mendeklarasikan set untuk atribut Senjata
		this.Senjata=d;
	}
	
	public static void main(String [] args){
		Jepang makananPertama = new Jepang();
		makananPertama.setMakanan("Sushi"); //mengisi nilai setter Makanan
		System.out.print("Salah Satu Makanan Asal Jepang Adalah: "); //output kalimat
		System.out.println(makananPertama.getMakanan()); //memanggil setter Makanan dengan getter
	
		makananPertama.setPakaian("Kimono"); //mengisi nilai setter pakaian
		System.out.print("Pakaian Asal Jepang Adalah: "); //output kalimat
		System.out.println(makananPertama.getPakaian()); //memanggil setter Pakaian dengan getter
		
		makananPertama.setBunga("Sakura"); //mengisi nilai setter Bunga
		System.out.print("Bunga Asal Jepang Adalah: "); //output kalimat
		System.out.println(makananPertama.getBunga()); //memanggil setter Bunga dengan getter
		
		makananPertama.setSenjata("Katana"); //mengisi nilai setter Senjata
		System.out.print("Senjata Asal Jepang Adalah: "); //output kalimat
		System.out.println(makananPertama.getSenjata()); //memanggil setter Senjata dengan getter
	}
}
