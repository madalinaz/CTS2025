# Facade

- Usureaza lucrul cu framework-uri foarte complexe

- Realizeaza o fatada pentru aceste framework-uri, iar cine doreste sa utilizeze aceste framework-uri, poate folosi o fatada, fara a fi necesara cunoasterea tuturor claselor si metodelor

- Usureaza lucrul cu framework-uri complexe

- Conceptul este similar cu Gateway din orchestrarea de microservicii

![Facade Diagram](../img/Facade%20Diagram.png)

## Problema

- Pentru realizarea rezervărilor pachetelor turistice un operator trebuie să creeze pachetul turistic ideal pentru client. Apoi trebuie să rezerve cazarea la hotelul dorit, să caute zboruri pentru clienți și să salveze noul pachet rezervat.

- Să se realizeze un modul care să simplifice procesul de rezervare pentru operator.

### Clasele de baza

- Clasa Hotel

```java

package agentie.clase;


public class Hotel {
	private String numeHotel;

	public Hotel(String nume) {
		this.numeHotel = nume;
	}
	public void rezervaCamera(String oras) {
		System.out.println("In hotelul " + this.numeHotel +" din orasul " + oras + " se rezerva o camera.");
	}
}
```

- Clasa de zbor

```java
package agentie.clase;

import java.util.Calendar;

public class Zbor {
	private CompanieAeriana companie;
	private String orasPlecare ;
	private String destinatie;

	public Zbor(String orasPlecare, String destinatie, CompanieAeriana companie) {
		super();
		this.orasPlecare = orasPlecare;
		this.destinatie = destinatie;
		this.companie = companie;
	}

	public CompanieAeriana getCompanie() {
		return companie;
	}

	public void setCompanie(CompanieAeriana companie) {
		this.companie = companie;
	}

	public String getOrasPlecare() {
		return orasPlecare;
	}

	public void setOrasPlecare(String orasPlecare) {
		this.orasPlecare = orasPlecare;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	@Override
	public String toString() {
		return "Zbor [companie=" + companie + ", orasPlecare=" + orasPlecare + ", destinatie=" + destinatie + "]";
	}
}
```

- Companie Aeriana

```java
package agentie.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompanieAeriana {
	private String numeCompanieAeriana;

	public CompanieAeriana(String nume) {
		this.numeCompanieAeriana = nume;
	}

	@Override
	public String toString() {
		return "CompanieAeriana [numeCompanieAeriana=" + numeCompanieAeriana + "]";
	}

	public Zbor rezervaBiletAvion(String plecare, String destinatie) {
		Zbor zbor=new Zbor(plecare, destinatie, this);
		return zbor;
	}
}
```

### Clasa Facade

```java
package agentie.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Facade {
	public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie) {

		CompanieAeriana companieAeriana=new CompanieAeriana("CTSAirLines");
		Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
		Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);

		Hotel hotel = new Hotel("CTS Hotel");
		System.out.println(zborDus.toString());
		System.out.println(zborIntors.toString());
		hotel.rezervaCamera(orasDestinatie);
	}
}
```

### Implementare

- Clasele din framework-urile nostre sunt: Hotel, Companie Aeriana, Zbor

- Clasa Facade vine si simuleaza un flow de rezervare cu toti pasii:

  - Rezervarea unui bilet de avion
  - Rezervarea unui hotel

- Evitam astfel ca noi in Main sa apelam toate functiile din spatele procesului de rezervare

### Utilizari

- Folosit pentru implementari ale framework-urilor open-source

- De regula, fatada este Singleton - instanta unica

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
