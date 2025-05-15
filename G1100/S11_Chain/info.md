# Chain

- Un sistem de admitere
- Pentru un candidat am Nume, eseu, medieBac, medieExamen
- Vreau sa modelam procesul de admitere tinand cont de:
  - Am lista de candidati care s-au inscri la admitere
  - Vreau sa aplic o filtrare pe acesti candidati care se poate realiza pe mai multi pasi:
    - Filtrarea eseu 
    - Medie bac
    - Medie examen
- Vrem o implementare care sa permita rearanjarea filtrelor si sa putem adauga filtre suplimentare in timp

## Implementare

- Fiecare handler este responsabil de partea lui