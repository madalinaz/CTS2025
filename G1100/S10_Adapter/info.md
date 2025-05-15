# Adapter

- Avem un client:
  - nume
  - totalAchizitie

- Avem firma Emag si o firma partenera care vinde pe Emag
- La Emag am o interfat ICalculReducere
- La firma XYZ avem IEvaluareClient
- Firma XYZ este cumparata de Emag
  - Firma XYZ vreau sa tina cont de implementarea lui Emag
  - Totusi, Firma XYZ isi pastreaza clientul (adica Main-ul)