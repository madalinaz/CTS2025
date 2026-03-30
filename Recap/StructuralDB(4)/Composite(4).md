# Composite

- Este folosit cand este necesara crearea unei structuri ierarhice sau o structura arborescenta prin compunerea de obiecte

- **Sintagma:** Sa fie organizat intr-o ierarhie / structura arborescenta / fiecare categorie poate sa contina subcategorii

## Exemplu de modelare: Organigrama unei companii

- O companie are Angajati si Manageri.

- Fiecare Angajat primeste un salariu si ponteaza

- Managerul stabileste bonusul angajatilor pe care ii coordoneaza.

> Composite introduce o clasa abstracta cu functionalitati generale

- In arborele nostru, frunzele sunt Angajatii care nu au subordonati

- Nodurile sunt Manageri, Sef Departament, Director care au subordonati, dar care sunt si ei tot Angajati la baza

- Din acest motiv folosim o clasa abstracta / interfata - definim comportamentul comun pentru absolut toti angajatii, chiar daca sunt frunze sau noduri

![Diagrama Composite](../img/Diagrama%20Composite.png)

## Problema

- Agenția dorește realizarea unei aplicații software în care meniul să fie organizat într-o structură arborescentă pe categorii. Fiecare categorie poate conține alte subcategorii cu opțiuni, pe care operatorul să le acceseze. Astfel rezultă o structură ierarhică cu toate opțiunile.

- Să se implementeze modulul pentru generarea meniului aplicației software dorite de agenția de turism.

### Implementare

- Componenta abstracta -> Optiune Meniu

  - Clasa abstracta / interfata care descrie toate componentele arborescentei

- Composite -> Categorie

  - Reprezinta componenta care poate sa contina fii

- NodFrunza -> Item Meniu

  - Frunzele care nu au fii

#### Clasele de baza

- Intefata optiune

```java
package agentie.clase;

public interface Optiune {
	void stergeNod(Optiune optiune) throws Exception;
	void adaugaNod(Optiune optiune) throws Exception;
	Optiune getNod(int index) throws Exception;
	void descriere();
}
```

- Item -> Clasa frunza

  - Se restrictioneaza accesul la functiile care permit transformarea frunzei in nod

```java
package agentie.clase;

public class Item implements Optiune {

	private String nume;

	public Item(String nume){
		this.nume=nume;
	}
	@Override
	public void stergeNod(Optiune optiune) throws Exception {
		throw new Exception("NU este implementata");

	}

	@Override
	public void adaugaNod(Optiune optiune) throws Exception {
		throw new Exception("NU este implementata");
	}

	@Override
	public Optiune getNod(int index) throws Exception {
		throw new Exception("NU este implementata");
	}

	@Override
	public void descriere() {
		System.out.println("   Item: " + nume);
	}

}
```

- Categoria -> Care contine o lista de subnoduri / frunze

```java
package agentie.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categorie implements Optiune {

	List<Optiune> lista;
	String nume;

	public Categorie(String nume){
		lista=new ArrayList<Optiune>();
		this.nume=nume;
	}

	@Override
	public void stergeNod(Optiune optiune) {
		lista.remove(optiune);
	}

	@Override
	public void adaugaNod(Optiune optiune) {
		lista.add(optiune);
	}

	@Override
	public Optiune getNod(int index) {
		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Categoria "+nume);
		for(Optiune optiune:lista){
			optiune.descriere();
		}
	}
}
```

- Main

  - Responsabil pentru crearea arborului

```java
package agentie.program;

import agentie.clase.Categorie;
import agentie.clase.Item;
import agentie.clase.Optiune;

public class Program {

	public static void main(String[] args) {
		Optiune cFile=new Categorie("File");
		Optiune cCamere=new Categorie("Camere");
		Optiune cOferte=new Categorie("Oferte");

		Optiune iOpen=new Item("Open");
		Optiune iSave=new Item("Save");
		Optiune iVizualizare=new Item("Vizualizare camere");
		Optiune iEditare=new Item("Editare camere");
		Optiune iOfertaCraciun=new Item("Oferte craciun");
		Optiune iCreazaOferta=new Item("Creaza oferta");

		try {
			cCamere.adaugaNod(iVizualizare);
			cCamere.adaugaNod(iEditare);

			cOferte.adaugaNod(iOfertaCraciun);
			cOferte.adaugaNod(iCreazaOferta);

			cFile.adaugaNod(iOpen);
			cFile.adaugaNod(iSave);
			cFile.adaugaNod(cCamere);
			cFile.adaugaNod(cOferte);

			cFile.stergeNod(iSave);
			cOferte.adaugaNod(iSave);

			cFile.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
```

#### Observatii

- Clasele Composite contin o lista cu elementele de tip AbstractComponent - care administreaza sub-nodurile

- Clasele NodFrunza implementeaza metodele de adaugare sau stergere nod, chiar daca nu sunt utilizate (se restrictioneaza accesul prin throw new Error)

## Utilizari

- Meniurile aplicatiilor

- Meniurile de restaurant

- Organizarea studentilor in serii si grupe

- Pentru a reprezenta orice structura aborescenta

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
