package DP.Structurale.Composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class Container extends ANode {

	private float greutatePorprie;
	private List<ANode> listaCopii;
	
	@Override
	public float getGreutate() {
		float greuateTotala =this.greutatePorprie;
		if(listaCopii!= null) {
			for(ANode copil : this.listaCopii) {
				greuateTotala += copil.getGreutate();
			}	
		}
		
		return greuateTotala;
	}

	public Container(float greutatePorprie) {
		super();
		this.greutatePorprie = greutatePorprie;
		this.listaCopii = new ArrayList<ANode>();
	}

	@Override
	public boolean esteFragil() {
		if(listaCopii!= null) {
			for(ANode copil : this.listaCopii) {
				if(copil.esteFragil()) {
					return true;
				}
			}	
		}
		
		return false;
	}

	@Override
	public void adauga(ANode copil) {
		if(copil != null && listaCopii!= null) {
			this.listaCopii.add(copil);
		}		
	}

	@Override
	public void sterge(ANode copil) {
		if(copil != null && listaCopii!= null) {
			this.listaCopii.remove(copil);
		}	
	}

	@Override
	public ANode getCopil(int index) {
		if(listaCopii!= null && index >= 0 && index < this.listaCopii.size()
				) {
			return this.listaCopii.get(index);
		}	
		
		return null;
	}

}
