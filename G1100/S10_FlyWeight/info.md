# FlyWeight

- Avem o cafenea care emite bon fiscal
- Cand se printeaza bonul se afiseaza mesaje de marketing
- Mesajul ocupa foarte mult spatiu si nu merita sa generezi un obiect de acel tip la fiecare printare pentru ca ocupa prea multa memorie
- **FlyWeight**: Optimizeaza memoria pentru aceste obiecte. Obiectul este spart in zona partajabila cu in zona nepartajabile
  - Zona partajabila: Mesajul
  - Zona nepartajabila: Bon
