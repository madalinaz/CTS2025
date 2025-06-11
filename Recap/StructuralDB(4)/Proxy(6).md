# Proxy

- Este utilizat cand se doreste pastrarea unei functionalitati doar in anumite conditii

- De regula, introduce o conditie de acces la o resursa

- Prin proxy, controlam si accesul si comportamentul unei resurse

- Asemanator cu conceptul de Proxy din reteleistica - controleaza si restrictioneaza accesul la o anumita platforma

![Diagrama Proxy](../img/Diagrama%20Proxy.png)

## Problema

- Agenția ia hotărârea că pachetele de transport din ofertă pot fi rezervate doar de către pensionari – persoane cu vârsta peste 65 de ani.

- Să se implementeze un nivel intermediar care să permită realizarea rezervării doar pentru persoanele cu vârsta peste 65 de ani.

### Implementare

- PachetTuristic -> interfata obiectului real

- PachetTransport -> clasa obiectului real

  - Obiectele acestei clase o sa fie controlate de catre proxy

- ProxyPachet -> clasa care gestioneaza refereinta catre obiectul real

  - Responsabila de implementarea noii reguli de varsta

#### Clasele de baza

- Interfata PachetTuristic

```java
package agentie.clase;


public interface PachetTuristic {
	void descriere();
	void rezervaPachet();
}
```

- Pachetul Concret - varianta de baza

```java
package agentie.clase;

public class PachetTransport implements PachetTuristic {

	private Persoana persoana;

	public Persoana getPersoana() {
		return persoana;
	}

	public void setPersoana(Persoana persoana) {
		this.persoana = persoana;
	}

	public PachetTransport(Persoana persoana) {
		this.persoana = persoana;
	}

	@Override
	public void descriere() {
		System.out.println("Acest pachet inlude doar transport");
	}

	@Override
	public void rezervaPachet() {
		System.out.println(persoana.getNume() + " a rezervat un pachet de transport");

	}
}
```

#### Clasa ajutatoare

- Clasa persoana ne ajuta pentru a simula clientul care cere un pachet

```java

package agentie.clase;

public class Persoana {

	private String nume;
	private int varsta;

	public Persoana(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Persoana [nume=" + nume + ", varsta=" + varsta + "]";
	}
}
```

#### Clasa Proxy

- Implementeaza interfata de baza pentru a putea substitui un Pachet Turistic

- Tine o instanta a clasei PachetTuristic pentru a folosi functionalitatile din interior

```java

package agentie.clase;

public class ProxyPachet implements PachetTuristic {

	private PachetTransport pachet;

	public ProxyPachet(PachetTransport pachet) {
		this.pachet = pachet;
	}

	public ProxyPachet(Persoana persoana) {
		this.pachet = new PachetTransport(persoana);
	}

	@Override
	public void descriere() {
		pachet.descriere();
	}

	@Override
	public void rezervaPachet() {
		if (pachet.getPersoana().getVarsta() >= 65) {
			pachet.rezervaPachet();
		} else {
			System.out.println("Rezervarea nu este permisa, deoarece " + pachet.getPersoana().getNume() + " are doar "
					+ pachet.getPersoana().getVarsta() + " ani.");
		}
	}
}
```

#### Main

- Programul apelant

```java
package agentie.program;

import agentie.clase.PachetTransport;
import agentie.clase.Persoana;
import agentie.clase.ProxyPachet;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Popescu", 34);
		PachetTransport pachetTransport=new PachetTransport(persoana);
		pachetTransport.rezervaPachet();

		ProxyPachet pachetTransportProxy=new ProxyPachet(persoana);
		pachetTransportProxy.rezervaPachet();

	}
}
```

#### Observatii

- Clasa ProxyPachet implementeaza PachetTuristic pentru a putea fi folosit ca un pachet de sine stator => respectam LSP

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
