# Decorator

- Este utilizat pentru a modifica functionalitati ale unui obiect la runtime

- Poate sa fie utilizat si pentru adaugarea de noi functionalitati sau caracteristici la runtime

- Se pot face decorari multiple prin mostenirea continua

- **Sintagma:** Se doreste adaugarea unei functionalitati pentru o perioada de timp / temporar

![Decorator Diagram](../img/Decorator%20Diagram.png)

## Problema

- Agenția de turism dorește să ofere pentru o perioadă de trei luni posibilitatea de anulare a pachetelor rezervate. Această ofertă expiră în trei luni. Managerul agenției nu dorește să modifice codul, deoarece după trei luni trebuie să modifice iar codul sursă.

- Să se implementeze modulul care asigură oferta agenției fără a se modifica codul existent.

### Implementare

- AbstractProduct -> Pachet Turistic

  - Interfata comuna pachetelor

- ConcreteProduct -> PachetCazare

  - Clasa concreta care exista deja in codul sursa

- AbstractDecorator -> Oferta Pachet Turistic

  - Clasa abstracta care defineste decoratorul

- Concrete Decorator -> Oferta Pachet Cazare

  - Decoratorul concret care contine logica de adaugat

#### Clasele din software-ul existent

- Interfata PachetTuristic

```java
package agentie.clase;

public interface PachetTuristic {
	void descriere();
}
```

- Clasa concreta PachetCazare

```java
package agentie.clase;

public class PachetCazare implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet include cazare");
	}

}
```

#### Clasele decorator

- Decoratorul abstract, cel care introduce comportamentul normal al clasei, dar care declara ca metoda abstracta noua functionalitate

```java
package agentie.decorator;

import agentie.clase.PachetTuristic;

public abstract class OfertaPachetTuristic implements PachetTuristic {
	private PachetTuristic pachetTuristic;

	public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
		this.pachetTuristic = pachetTuristic;
	}

	public void descriere(){
		pachetTuristic.descriere();
	}

	public abstract void anulareRezervare();
}
```

- Decoratorul concret care introduce logica pentru noya functionalitate

```java
package agentie.decorator;

import agentie.clase.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic {

	public OfertaPachetCazare(PachetTuristic pachetTuristic) {
		super(pachetTuristic);
	}

	@Override
	public void anulareRezervare() {
		System.out.println("Rezervarea de cazare a fost anulata.");
	}
}
```

## Utilizari

- Adaugarea de noi functionalitati pentru clasele existente

- Pentru imbunatatirea claselor existente fara a modifica codul existent si fara a face extinderi sau mosteniri

---

[Back](<0_IntroducereainDesignPatternsStructurale(1).md>)
