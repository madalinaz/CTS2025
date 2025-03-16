package DP.Structurale.Facade;

public class Facade {
	public static boolean verificaDisponibilitateBucatari(int nrBucatari, String data) {
		GestiuneBucatari bucatari = new GestiuneBucatari();
		int ct=0;
		for(int i=0;i<bucatari.getNrBucatari();i++)
			if(bucatari.getBucatar(i).verificaDisponibilitate(data))
				ct++;
		if(ct>=nrBucatari)
			return true;
		return false;
	}
	
	public static boolean verificaDisponibilitateSala(String data) {
		GestiuneSali sali = new GestiuneSali();
		//to do
		return true;
	}
}
