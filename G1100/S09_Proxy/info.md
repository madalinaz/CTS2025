# Proxy

- Avem o pestera
  - Management al vizitelor cu nume, pret, ghid si o functie de vizitare

- In lunile mai putin aglomerate nu merita sa stea mereu ghidul la pestera pentru oricine
- Se adauga noua restrictie: cand se strang 5 vizitatori atunci vine un ghid care sa coordoneze vizita

- Asadar, adaug un proxy pentru controlul obietului pestera printr-o lista de asteptare. Cand se strang 5 vizitatori atunci fac pestera

- Fara proxy trebuia sa avem 2 clase: Pestere de vara si de iarna cu extends pestera. Proxy ne ajuta sa evitam dublarea codului si sa handle-uiasca doar partea de validare extra.