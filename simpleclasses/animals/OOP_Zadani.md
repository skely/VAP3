
# Zadání:

### Vytvořte třídu Animal:
- **Atributy**:
    - `name` – řetězec pro jméno zvířete.
    - `age` – celé číslo pro věk zvířete (inicializováno na 0).
- **Konstruktory**:
    - Vytvořte konstruktor, který přijme a nastaví jméno zvířete.
- **Metody**:
    - `getName()` – vrací jméno zvířete.
    - `setName()` – nastaví nové jméno.
    - `getAge()` – vrací věk zvířete.
    - `setAge()` – nastaví věk zvířete.
    - `growOlder()` – zvýší věk o 1 rok.
    - `makeSound()` – výchozí metoda, která vypíše "Animal makes a sound".
    - `introduceYourself()` – vypíše jméno a věk zvířete ve formátu: "I am an animal named X and I am Y years old."

### Vytvořte třídu Dog, která dědí od Animal:
- **Atributy**:
    - `breed` – řetězec pro plemeno psa.
- **Konstruktory**:
    - Konstruktor přijímá jméno psa a jeho plemeno.
- **Metody**:
    - `getBreed()` – vrací plemeno psa.
    - Přepište metodu `makeSound()`, aby vypisovala "Woof woof".

### Vytvořte třídu Cat, která dědí od Animal:
- **Atributy**:
    - `color` – řetězec pro barvu kočky.
- **Konstruktory**:
    - Konstruktor přijímá jméno a barvu kočky.
- **Metody**:
    - `getColor()` – vrací barvu kočky.
    - Přepište metodu `makeSound()`, aby vypisovala "Meow".

### Vytvořte spustitelnou třídu AnimalMain:
- Vytvořte několik objektů typu `Dog` a `Cat`.
- Uložte tyto objekty do pole typu `Animal[]`.
- Procházejte toto pole a:
    - Nastavte věk každému zvířeti.
    - Zavolejte metody `makeSound()`, `introduceYourself()` a `growOlder()`.
- Nakonec znovu zavolejte metodu `introduceYourself()` po "zestárnutí" všech zvířat.
