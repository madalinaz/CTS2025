# Decorator

- Avem mai multe tipuri de pizza
- Pizza: getIngrediente, getPret

- Avem 2 tipuri de pizza: PizzaA, PizzaB cu ingrediente si preturi default
- Dupa un timp vrem sa adaugam un tip nou de pizza CrownPizza (CheesyBites): adica o pizza de tip A/B doar ca o decoreaza cu o margine speciala cu branza (dar are aceleasi ingrediente ca pizza de baza)
- Decorator: Adaug noi functionalitati la runtime

## Decorator vs Proxy

- Folosim un decorator abstract aici care arata ca proxy pentru a adauga tipuri noi de pizza sau decorator la decorator
- DECORATOR CLASA ABSTRACTA
- Decorator este la Runtime neaparat