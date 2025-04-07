package dp.C7.composite.clase;

import java.util.ArrayList;
import java.util.List;


public class Structura extends ANod{
	List<ANod> structura = new ArrayList<>();
	String numeStructura;//eticheta
	
	public Structura(String numeStructura){
		this.numeStructura = numeStructura;
	}
	@Override
	public String getDenumire() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPret() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String getInfo(){
		String info = "";
		info += this.numeStructura + "\n";
		for(ANod n: structura){
			info += " " + n.getInfo();
			info += "\n";
		}
		return info;
	}
	
	@Override
	public void adaugaNod(ANod elemStructura){
		structura.add(elemStructura);
	}

	@Override
	public void eliminaNod(ANod elemStructura){
		structura.remove(elemStructura);
	}

	@Override
	public ANod getNod(int i){
		return structura.get(i);
	}

}
