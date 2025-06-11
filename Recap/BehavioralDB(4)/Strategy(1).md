# Strategy

- Este folosit atunci cand avem mai multi algoritmi pentru rezolvarea unei probleme, iar alegerea variantei se face la runtime

- Fiecare comportament este dat de o clasa

- Defineste strategia la runtime

- Evitam nested if-else commands

- **SINTAGMA:** Decidem in momentul executiei / In momentul platii / Trebuie sa stabilim la anumite momente

![Diagrama Strategy](../img/Diagrama%20Strategy.png)

## Problema

- Agenția de Turism dorește implementarea modului de plată al pachetelor turistice rezervate. Modul de plată îl decide clientul în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul, cash sau prin PayPal.

- Să se implementeze modulul de plată

### Implementarea

- IStrategy -> ModPlata -> intefata / clasa abstracta care defineste la nivel abstract obiectele ce ofera noi moduri de prelucrare

- Strategy -> Cash, Card, PayPal -> clasele concrete care implementeaza algoritmii de prelucrare

- Obiect -> Client -> clasa care gestioneaza referinta la IStrategy, cel care alege strategia

#### Clasele Strategie

- Intefata IStrategy

```java
package agentie.strategy;

public interface ModPlata {

 void plateste(String numeClient, double sumaPlatita);
}
```

- Strategiile de plata (Cash, Card, PayPal)

```java
package agentie.strategy;

public class Cash implements ModPlata {

 @Override
 public void plateste(String numeClient, double sumaPlatita) {
  System.out.println(numeClient + " plateste cash suma de " + sumaPlatita);
 }

}
```

```java
package agentie.strategy;

public class Card implements ModPlata {

 @Override
 public void plateste(String numeClient, double sumaPlatita) {
  System.out.println(numeClient + " plateste cu cardul suma de " + sumaPlatita + " RON");
 }

}
```

```java
package agentie.strategy;

public class PayPal implements ModPlata {

 @Override
 public void plateste(String numeClient, double sumaPlatita) {
  System.out.println(numeClient + " plateste prin PayPal suma de "+sumaPlatita+" RON");
 }
}
```

#### Clasa Client

- Alegere strategia de plata la runtime

```java

package agentie.strategy;

public class Client {

 private String nume;
 private ModPlata modPlata;
 
 public void plateste(double sumaDePlata){
  modPlata.plateste(this.nume, sumaDePlata);
 }
 
 public String getNume() {
  return nume;
 }
 public void setNume(String nume) {
  this.nume = nume;
 }
 public ModPlata getModPlata() {
  return modPlata;
 }
 public void setModPlata(ModPlata modPlata) {
  this.modPlata = modPlata;
 }
 
 public Client(String nume, ModPlata modPlata) {
  super();
  this.nume = nume;
  this.modPlata = modPlata;
 }

 
 public Client(String nume) {
  super();
  this.nume = nume;
  this.modPlata = new Cash();
 }
 
}
```

#### Clasa Main

- Setam la runtime metoda pe care o dorim

```java
package agentie.program;

import agentie.strategy.Card;
import agentie.strategy.Cash;
import agentie.strategy.Client;

public class Program {

 public static void main(String[] args) {
  Client client=new Client("Popescu");
  
  client.setModPlata(new Card());
  client.plateste(300);
  
  client.setModPlata(new Cash());
  client.plateste(100);
 }

}
```

### Observatii

- In cadrul fiecare clase concrete de tip Strategy (cele 3 metode de plata) se implementeaza metoda de procesare

- In clasa care gestioneaza instanta Strategy, oferim modalitatea de alegere a strategiei la runtime (prin setter)

## Utilizari

- Furnizarea de comportamente pentru metodele de sortare - Transmitem catre functia sort tipul - quick sort, bubble sort, merge sort, etc

- Utilizarea validatoarelor pentru anumite controale
