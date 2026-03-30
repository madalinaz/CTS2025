# Singleton

- Putem sa avem un singur obiect tipul clasei respective

- Clasa se ocupa de de restrictia de unicitate

- **SINTAGMA:** Instanta unica, o singura instanta

## Problema

- Se considera Agentia de turism: AgeTur

- Sa se realizeze o aplicatie pentru vanzarea de pachete turistice. Aplicatia trebuie sa gestioneze cu foarte mare atentie vanzarea de pachete, astfel incat sa nu se vanda de doua ori acelasi pachet

- Pentru rezolvarea acestui lucru se recomanda existenta unei singure instante a agentiei

![Singleton - Structura](../img/Singleton%20-%20Structura.png)

## Implementare

- Clasa Agentie are o instanta de tipul Agentie si are grija sa fie unica astfel de instanta
  - Constructorul este privat
  - Clasa Agentie are o instanta statica a Agentiei
  - Crearea de instante se face printr-o metoda statica care verifica daca nu cumva instanta este deja creata

1. Eager Initialization

- Instanta Agentie este initializata la inceputul executarii programului

- Poate sa nu fie folosita, instanta tot exista in memorie

```java
package v1_eagerinitialization;

public class AgentieEager {
 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static final AgentieEager instanta = new AgentieEager();

 private AgentieEager() {
  this.numeAgentie = "AgeTur";
  this.capital = 1000;
  this.numarAngajati = 5;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }

 public static AgentieEager getInstanta(String nume, float capital, int numarAngajati) {
  return instanta;
 }
}
```

2. Static Block Initialization

- Se initializeaza intr-un bloc static, adica si mai devreme decat eager initialization

- Furnizează posibilitatea de captare a posibilelor excepții generate de inițializarea instanței statice.

```java
package v2_staticblock;

public class AgentieStaticBlock {
 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static AgentieStaticBlock instanta;

 static {
  try {
   instanta = new AgentieStaticBlock();
  } catch (Exception exception) {
   System.out.println("Agentia nu poate fi creata.");
  }
 }

 private AgentieStaticBlock() {
  this.numeAgentie = "AgeTur";
  this.capital = 1000;
  this.numarAngajati = 5;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }

 public static AgentieStaticBlock getInstanta(String nume, float capital, int numarAngajati) {
  return instanta;
 }
}
```

3. Lazy Initialization

- Se apeleaza metoda get instanta care trimite referinta la instanta Agentie sau o creeaza la apelare

- Problema acestei variante apare atunci când este folosită multithreading, deoarece metoda poate fi apelată în același timp de pe două fire de execuție și astfel vor fi create două obiecte diferite.

```java
package v3_lazyinitialization;

public class Agentie {
 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static Agentie instanta = null;

 private Agentie(String numeAgentie, float capital, int numarAngajati) {
  this.numeAgentie = numeAgentie;
  this.capital = capital;
  this.numarAngajati = numarAngajati;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }

 public static Agentie getInstanta(String nume, float capital, int numarAngajati) {
  if (instanta == null) {
   instanta = new Agentie(nume, capital, numarAngajati);
  }
  return instanta;
 }
}
```

4. Thread Safe

- Se utilizeaza syncronized in cazul in care se apeleaza *getInstanta* pe thread-uri diferite

- Această variantă asigură faptul că metoda nu o să fie apelată de un alt fir de execuție până nu se termină metodă apelată deja pe un fir de execuție

```java
package v4_threadsafe;

public class AgentieThreadSafe {
 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static AgentieThreadSafe instanta = null;

 private AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati) {
  this.numeAgentie = numeAgentie;
  this.capital = capital;
  this.numarAngajati = numarAngajati;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }

 public static synchronized AgentieThreadSafe getInstanta(String nume, float capital, int numarAngajati) {
  if (instanta == null)
   instanta = new AgentieThreadSafe(nume, capital, numarAngajati);
  return instanta;
 }
}
```

5. Inner Static Helper Class

- Se foloseste o clasa helper in cadrul clasei Agentie pentru a face initializarea

- Este incarcata de JVM doar cand este folosita prima data => Lazy-Loading, Thread-Safe

- getInstanta returneaza singura instanta a clasei AgentieInnerClass, creata in cadrul AgentieHelper

- Static Inner Classes NU sunt instantate odata cu clasa externa, ci doar cand sunt apelate explicit

```java
package v5_innerstatichelperclass;

public class AgentieInnerClass {
 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static class AgentieHelper{
  private static final AgentieInnerClass instanta = new AgentieInnerClass();
 }

 public static AgentieInnerClass getInstanta(String nume, float capital, int numarAngajati) {
  return AgentieHelper.instanta;
 }

 private AgentieInnerClass() {
  this.numeAgentie = "AgeTur";
  this.capital = 1000;
  this.numarAngajati = 5;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }
}
```

6. Enum Initialization

- Clasa Agentie este un enum

- Prin declararea unui singur element în enum (instanta), creezi o instanță unică garantată de JVM. Aceasta este
  - thread-safe implicit
  - protejată împotriva serializării și reflexiei
  - lazy-loaded

```java

package v6_enum;

public enum AgentieEnum {
 instanta;
 
 private String numeAgentie;
 private float capital;
 private int numarAngajati;
 
 private AgentieEnum() {
  this.numeAgentie = "AgeTur";
  this.capital = 1000;
  this.numarAngajati = 5;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }
}
```

7. Serialization

- Instanta este salvata intr-un fisier si o citesti din fisier

- Dacă avem serializare și apoi deserializăm o instanță singleton, se vor obține doua instanțe: una creată și una deserializată.

```java
package v6_serialization;

import java.io.Serializable;

public class AgentieSerialization implements Serializable {

 private static final long serialVersionUID = 1L;

 private String numeAgentie;
 private float capital;
 private int numarAngajati;

 private static AgentieSerialization instanta = null;

 public static AgentieSerialization getInstanta(String nume, float capital, int numarAngajati) {
  if (instanta == null)
   instanta = new AgentieSerialization(nume, capital, numarAngajati);
  return instanta;
 }

 protected Object readResolve() {
  return getInstanta("Nu conteaza", 0, 0);
 }
 
 private AgentieSerialization(String numeAgentie, float capital, int numarAngajati) {
  this.numeAgentie = numeAgentie;
  this.capital = capital;
  this.numarAngajati = numarAngajati;
 }

 public String getNumeAgentie() {
  return numeAgentie;
 }

 public void setNumeAgentie(String numeAgentie) {
  this.numeAgentie = numeAgentie;
 }

 public float getCapital() {
  return capital;
 }

 public void setCapital(float capital) {
  this.capital = capital;
 }

 public int getNumarAngajati() {
  return numarAngajati;
 }

 public void setNumarAngajati(int numarAngajati) {
  this.numarAngajati = numarAngajati;
 }
}
```

```java
package v6_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Program {

 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
  AgentieSerialization agentie=AgentieSerialization.getInstanta("Nume1", 1000, 10);
  ObjectOutput out=new ObjectOutputStream(new FileOutputStream("fisier.dat"));
  out.writeObject(agentie);
  out.close();
  
  ObjectInput in = new ObjectInputStream(new FileInputStream("fisier.dat"));
  AgentieSerialization agentie2=(AgentieSerialization)in.readObject();
  
  agentie2.setNumarAngajati(200);
  agentie2.setCapital(2000);
  agentie2.setNumeAgentie("Nume2");
  
  System.out.println(agentie.getNumeAgentie()+" "+agentie.getCapital());
  System.out.println(agentie2.getNumeAgentie()+" "+agentie2.getCapital());
 }

}
```

8. Singleton Registry

- Se tine o mapa si instante stocate dupa cheie

```java
package v8_registry_of_singletons;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
   private RegistryPachete(){} 
   static Map<String, PachetTuristic> collection=new HashMap<>();
      
   public static void register(String name, PachetTuristic value) throws Exception 
      {
          if ( collection.containsKey(name)) 
              throw new Exception("Key '" + name + "' already registered"); 
          else 
              collection.put(name, value); 
      }
      public static PachetTuristic getPachet(String name) 
      {
          return collection.get(name); 
      }
}
```

```java
package v8_registry_of_singletons;

public class Program {

 public static void main(String[] args) {
  PachetCazare cazare=new PachetCazare();
  PachetCazare cazare2=new PachetCazare();
  PachetTransport transport=new PachetTransport();
  
  try {
   RegistryPachete.register("Cazare", cazare);
   RegistryPachete.register("Transport", transport);

   //RegistryPachete.register("Cazare", cazare2);
   
   RegistryPachete.getPachet("Cazare").descriere();
   RegistryPachete.getPachet("Transport").descriere();
   
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  

 }

}
```

## Singleton VS Clasa Statica

- Un singleton respecta principiile OOP

- Un obiect singleton poate sa fie transmis ca parametru intr-o functie. O clasa statica nu poate

- O clasă Singleton poate implementa o interfață sau extinde o altă clasă

## Utilizari

- Deschiderea unei singure instante a aplicatiei

- Conexiunea unica la baza de date

- Accesarea resurselor dispozitivelor mobile (SharedPreferences în Android)

---

[Back](0_IntroducereainDesignPatterns(1).md)
