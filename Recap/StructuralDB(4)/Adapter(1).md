# Adapter

- Rezolva problema utilizarii anumitor clase din framework-uri diferite, care nu au interfata comuna

- Clasele existente NU se modifica, ci se adauga noi clase pentru realizarea Adapter-ului

- Implementarea se face printr-o clasa Wrapper

- **SINTAGMA:** Clasele nu sunt asemenatoare cu cele din software-ul ... / Cele dou software-uri trebuie sa fie folosite impreuna fara a modifica clasele / Nu sunt compatibile si NU trebuie modificat codul existent

> Adapterul NU adauga functionalitati

![Adapter Diagram](../img/Adapter%20Diagram.png)

## Problema

- Agenția de turism AgeTur dorește să se ocupe și de închiriat mașini pentru clienții săi. De aceea cumpără un soft pentru închiriat mașini, însă operatorul trebuie să intre în fiecare aplicație pentru rezervarea unui pachet complet de cazare, transport și mașină închiriată.

- Clasele din softul achiziționat nu sunt asemănătoare cu clasele din softul deținut de agenție.

- Să se rezolve problema, astfel încât, cele două soft-uri să poată fi folosite împreună, însă fără a modifica clasele din cele două soft-uri.

### Adaptor de clase

- **IMPORTANT:**In Java, avem problema mostenirii multiple

#### Clasele initiale

- Interfata comuna pentru toate pachetele turistice

```java
package agentie.adapterclase.clase;

public interface PachetTuristic {
	void descriere();
	void rezervaPachet();
}
```

- Clasa initiala pentru cazare

```java
package agentie.adapterclase.clase;

public class PachetCazare implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet include doar cazare");
	}

	@Override
	public void rezervaPachet() {
		System.out.println("A fost realizata o rezervare de cazare");

	}

}
```

#### Clasele din pachetul de inchiriere de masini

- Base class Masina

```java

package agentie.adapterclase.inchirieremasini;

public class Masina {

	private String model;
	private double capacitateCilindrica;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacitateCilindrica() {
		return capacitateCilindrica;
	}

	public void setCapacitateCilindrica(double capacitateCilindrica) {
		this.capacitateCilindrica = capacitateCilindrica;
	}

	public Masina(String model, double capacitateCilindrica){
		this.model=model;
		this.capacitateCilindrica=capacitateCilindrica;
	}

	@Override
	public String toString() {
		return "Masina [model=" + model + ", capacitateCilindrica=" + capacitateCilindrica + "]";
	}
}
```

- Clasa concreta MasinaInchiriata

```java
package agentie.adapterclase.inchirieremasini;

public class MasinaInchiriata {
	private Masina masina;

	public MasinaInchiriata(Masina masina){
		this.masina=masina;
	}
	public void inchiriazaMasina(){
		System.out.println("A fost inchiriata masina"+masina.toString());
	}
	@Override
	public String toString() {
		return "MasinaInchiriata [masina=" + masina + "]";
	}

}
```

#### Adapterul de clase

- Clasa adapter extinde MasinaInchiriata care este clasa din noul software si interfata din actualul software

- NU puteam extinde 2 clase in Java

```java
package agentie.adapterclase.clase;

import agentie.adapterclase.inchirieremasini.Masina;
import agentie.adapterclase.inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic {

	public PachetMasinaInchiriata(Masina masina){
		super(masina);
	}

	@Override
	public void descriere() {
		System.out.println(super.toString());
	}

	@Override
	public void rezervaPachet() {
		super.inchiriazaMasina();
	}

}
```

### Adaptor de obiecte

- Este un wrapper peste obiectul concret

#### Clasa initiala

- Clasa initiala PachetCazare

```java
package agentie.adapterobiecte.clase;

public class PachetCazare implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet include doar cazare");
	}

	@Override
	public void rezervaPachet() {
		System.out.println("A fost realizata o rezervare de cazare");

	}

}
```

#### Clasele din pachetul Masina Inchiriata

- Clasa MasinaInchiriata

```java
package agentie.adapterobiecte.inchirieremasini;

public class MasinaInchiriata {
	private Masina masina;

	public MasinaInchiriata(Masina masina){
		this.masina=masina;
	}
	public void inchiriazaMasina(){
		System.out.println("A fost inchiriata masina"+masina.toString());
	}
	@Override
	public String toString() {
		return "MasinaInchiriata [masina=" + masina + "]";
	}

}
```

#### Adapterul de obiecte

- Avem o instanta din clasa externa cu care lucram

```java
package agentie.adapterobiecte.clase;

import agentie.adapterobiecte.inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata implements PachetTuristic {

	private MasinaInchiriata masinaInchiriata;

	public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata){
		this.masinaInchiriata=masinaInchiriata;
	}

	@Override
	public void descriere() {
		System.out.println(this.masinaInchiriata.toString());
	}

	@Override
	public void rezervaPachet() {
		this.masinaInchiriata.inchiriazaMasina();
	}

}
```

### Restrictii de implementare

- Adapterul de clase mosteneste clasa existenta si implementeaza interfata la care trebuie sa faca adaptarea

- Restrictia apare la mostenirea multipla

## Utilizari

- Se utilizeaza cand este necesara conlucrarea mai multor framework-uri si nu se doreste adaptarea codului existent

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
