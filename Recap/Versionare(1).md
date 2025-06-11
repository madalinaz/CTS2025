# Versionare - GIT

## Necesitatea controlului versiunilor

- Proiectele de dezvoltare software se realizeaza in echipa (caracterul colaborativ al proiectelor)

- Nevoia de backup pentru codul scris

- Istoricul modificarilor

## Terminologie

- **VCS** = Version Control Software

  - Urmareste modificarile in real time
  - Permite RollBack

- **SCM** = Source Control Management

  - Permite lucrul pe branch-uri
  - Permite integrarea de CI/CD sau procese DevOps

- **Repository** = Componenta server ce contine privind informatii despre ierarhia de fisiere si reviziile asupra acestora

- **Checkout** = Preluarea in mediul local a unei anumite revizii din repository

- **Commit** = Cererea de publicare in repository-ul local a unor modificari

- **Pull** = Actualizarea informatiilor locale cu cele de pe server

- **Conflict** = Mai multi programatori au realizat modificari in acelasi fisier din proiect

  - Sistemul de versionare nu poate imbina modificarile si este nevoie de interventia umana pentru a realiza merge

- **Merge** = Procesul de unire a doua sau mai multe versiuni de lucru

- **Branch** = Ramuri secundare de dezvoltare a proiectului

- **Revert** = Revenirea la versiunea anterioara pe un anumit branch

- **Stash** = Arhiva locala pentru un set de modificari

## GIT

- Dezvoltat de Linus Torvalds petru a gestiona proietul de dezvoltare a Kernelului Linux in 2005

- Este un sistem distribuit de versionare

- Fiecare programator are o copie a proiectului pe masina proprie

- Toti programatorii au access la istoricul modificarilor

## Flux GIT

1. Initializare Repository

```bash
git init
```

2. Descarca proiect

```bash
git clone
```

3. Commit modificari

```bash
git commit
```

4. Lucru in proiect
   - urmat mereu de revenirea la commit modificari

## Tutorial comenzi GIT

```bash
git status
```

- Arata modificarile din fisier

```bash
git add
```

- Adaugarea noului fisier in track

```bash
git commit -m "Commit Mesasge"
```

- Comiterae noului fisier in serverul local

```bash
git push
```

- Trimiterea in repository a modificarilor

```bash
git branch
```

- Afisare branchurilor locale

```bash
git branch -a
```

- Afisarea tuturor branchurilor (locale si de pe repository)

```bash
git checkout <<branch_local>>
```

- Se schimba branchul pe care se lucreaza

```bash
git branch -b <<new_branch>>
```

- Se creaza un branch pe baza celui curent

```bash
git branch -b <<new_branch>> <<source_branch>>
```

- Se creaza un branch pe baza celui specificat

```bash
git branch -D <branch>>
```

- Stergerea unui branch

```bash
git merge <<branch_with_updates>>
```

- Aplica modificarile existente in branch-ul din comanda pe baza branchului curent

---

[Back](../README.md)
