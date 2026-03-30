# Flyweight

- Este utilizat atunci cand trebuie sa construim foarte multe obiecte / instante ale unei clase, insa majoritatea obiectelor au o parte comuna sau permanenta

- Prin utilizarea Flyweight reducem consumul de memorie, pastrandu-se o singura instanta a partii comune pentru toate obiectele

- Partea care difera de la un obiect la altul este salvata intr-o clasa si este adaugata dupa construirea obiectelor

- NU se foloseste Flyweight cand avem putine obiecte pentru ca se poate pierde mai multa memorie

## Exemplu de modelare: Spectatorii din tribuna unui joc video

- Cand avem un joc care presupune gestionarea unei tribune cu oameni se poate folosi Flyweight

- Construim o clasa doar cu atributele comune / identice si o clasa cu elementele care nu sunt comune

- La final, noi gestionam doar legaturile dintre elemente

## Problema

- Agenția organizează excursii și cu grupuri. Toate pachetele celor din grup vor avea același hotel de cazare, aceeași destinație și toți vor avea sau nu mic dejun inclus. Identificarea realizându-se după codul pachetului.

- Opțional fiecare persoană, dacă dorește, poate să aibă cina inclusă în pachet și numărul de excursii în care să meargă în zilele libere.

- Să se implementeze modulul care asigură gestiunea de pachete turistice pentru cienții agenției, ținându-se cont de faptul că memoria trebuie folosită în mod optim.

### Implementare

![Diagrama Flyweight](../img/Diagrama%20Flyweight.png)

#### Clasele de baza

- Interfata IPachetTuristic

```java
package agentie.clase;

public interface IPachetTuristic {

	void descriePachet(Optionale optionale);
}
```

- Clasa concreta PachetTuristic
  - Cuprinde partea obligatorie pentru a putea defini un pachet turistic

```java

package agentie.clase;

public class PachetTuristic implements IPachetTuristic {
	private int codPachet;
	private String Hotel;
	private String destinatie;
	private boolean micDejun;

	public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
		super();
		this.codPachet = codPachet;
		Hotel = hotel;
		this.destinatie = destinatie;
		this.micDejun = micDejun;
	}

	public int getCodPachet() {
		return codPachet;
	}

	public void setCodPachet(int codPachet) {
		this.codPachet = codPachet;
	}

	public String getHotel() {
		return Hotel;
	}

	public void setHotel(String hotel) {
		Hotel = hotel;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public boolean isMicDejun() {
		return micDejun;
	}

	public void setMicDejun(boolean micDejun) {
		this.micDejun = micDejun;
	}

	@Override
	public String toString() {
		return "PachetTuristic [codPachet=" + codPachet + ", Hotel=" + Hotel + ", destinatie=" + destinatie
				+ ", micDejun=" + micDejun + "]";
	}

	@Override
	public void descriePachet(Optionale optionale) {
		System.out.println("Pachetul Turistic cu codul " + codPachet
				+ ", are cazare la hotelul " + Hotel
				+ ", din orasul " + destinatie
				+ (micDejun ? " are " : " nu are ")
				+ "micDejun, " + (optionale.isCina() ? " are " : " nu are ")
				+ " inclusa cina si are un numar de "
				+ optionale.getNumarExcursii() + " excursii optionale");
	}
}
```

- Clasa pentru serviciile optionale / extra

```java

package agentie.clase;

public class Optionale {

	private boolean cina;
	private int numarExcursii;


	public Optionale(boolean cina, int numarExcursii) {
		super();
		this.cina = cina;
		this.numarExcursii = numarExcursii;
	}

	public boolean isCina() {
		return cina;
	}

	public void setCina(boolean cina) {
		this.cina = cina;
	}

	public int getNumarExcursii() {
		return numarExcursii;
	}

	public void setNumarExcursii(int numarExcursii) {
		this.numarExcursii = numarExcursii;
	}
}
```

#### Fabrica de pachete

- S-a optat pentru o fabrica de pachete pe modelul Singleton Registry (chiar daca instanta NU este unica)

- Aceasta clasa se ocupa cu managementul pachetelor turistice - partea obligatorie

```java
package agentie.clase;

import java.util.HashMap;

public class FabricaDePachete {

	private HashMap<Integer, IPachetTuristic> pacheteTuristice;

	public FabricaDePachete(){
		pacheteTuristice = new HashMap<Integer, IPachetTuristic>();
	}

	public int getNumarPachete(){
		return pacheteTuristice.size();
	}

	public IPachetTuristic getPachetTuristic(int codPachet){
		IPachetTuristic pachet = pacheteTuristice.get(codPachet);
		if(pachet == null){
			pachet = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
			pacheteTuristice.put(codPachet, pachet);
		}
		return pachet;
	}
}
```

#### Clasa Main

- Utilizez o fabrica de pachete pentru a putea extrage configuratia excursiei

- Adaug de fiecare data partea optionala pentru a avea excursia completa

```java
package agentie.program;

import agentie.clase.FabricaDePachete;
import agentie.clase.IPachetTuristic;
import agentie.clase.Optionale;
import agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		FabricaDePachete fabricaPachete = new FabricaDePachete();
		Optionale optional1=new Optionale(true, 3);
		Optionale optional2=new Optionale(false, 3);
		Optionale optional3=new Optionale(true, 1);
		Optionale optional4=new Optionale(true, 5);

		PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
		pachet.descriePachet(optional1);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		optional2.setNumarExcursii(40);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional2);
		fabricaPachete.getPachetTuristic(2).descriePachet(optional3);
		fabricaPachete.getPachetTuristic(1).descriePachet(optional4);

		System.out.println(fabricaPachete.getNumarPachete());

	/*	IPachetTuristic pachet1=new PachetTuristic(1, "blabla", "bucuresti", true);

		Optionale op1=new Optionale(true, 3, pachet1);
		Optionale op2=new Optionale(false, 3, pachet1);

		Optionale op3=new Optionale(true, 3, );*/

	}

}
```

#### Observatii

- Am ales sa pun intr-un map pe baza de ID pachetele turistice (partea partajabila) pentru ca eu am un grup care acceseaza un acel tip de pachet la care se adauga pentru fiecare optionalele

- Zona comuna (hotel, mic dejun, etc) este aceeasi pentru toti oamenii dintr-un grup

- Optionalele sunt specifice pentru fiecare individ in parte

- Registry-ul sub forma de factory cuprinde obiectele partajabile intre mai multe instante (persoane in cazul nostru)

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
