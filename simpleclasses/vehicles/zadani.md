# Zadání úkolu: Hierarchie vozidel v Javě

Vaším úkolem je vytvořit jednoduchou hierarchii tříd pro vozidla v Javě. Cílem je navrhnout několik tříd reprezentujících různá vozidla, kde každé vozidlo bude mít specifické vlastnosti a chování. Na závěr bude implementována hlavní třída pro testování vytvořených objektů.

## Požadavky

### 1. Abstraktní třída `Vehicle`
- Vytvořte abstraktní třídu s názvem `Vehicle`, která bude obsahovat:
  - **Atributy:**
    - `brand`: soukromý atribut typu `String`, který bude uchovávat značku vozidla.
  - **Konstruktor:**
    - Konstruktor, který přijímá parametr `brand` a inicializuje jej.
  - **Metody:**
    - `getBrand()`: metoda, která vrací značku vozidla.
    - `describe()`: abstraktní metoda, která bude implementována v podtřídách a bude vypisovat popis vozidla.

### 2. Třída `Car`
- Vytvořte třídu `Car`, která dědí od `Vehicle` a bude obsahovat:
  - **Atributy:**
    - `numSeats`: soukromý atribut typu `int`, který uchovává počet sedadel.
  - **Konstruktor:**
    - Konstruktor, který přijímá parametry `brand` a `numSeats`, a inicializuje je.
  - **Metody:**
    - Implementaci metody `describe()`, která vypíše popis auta ve formátu:
    ```
    This is a [brand] car with [numSeats] seats.
    ```

### 3. Třída `Truck`
- Vytvořte třídu `Truck`, která dědí od `Vehicle` a bude obsahovat:
  - **Atributy:**
    - `loadCapacity`: soukromý atribut typu `int`, který uchovává nosnost kamionu v tunách.
  - **Konstruktor:**
    - Konstruktor, který přijímá parametry `brand` a `loadCapacity`, a inicializuje je.
  - **Metody:**
    - Implementaci metody `describe()`, která vypíše popis kamionu ve formátu:
    ```
    This is a [brand] truck with a load capacity of [loadCapacity] tons.
    ```

### 4. Třída `VehicleMain`
- Vytvořte třídu `VehicleMain`, která bude obsahovat:
  - **Pole objektů typu `Vehicle`**, které bude obsahovat různé instance tříd `Car` a `Truck`.
  - **Iteraci** přes pole objektů a volání metody `describe()` pro každý objekt.

### 5. Příklad výstupu
- Program by měl generovat následující výstup:
```
    This is a Toyota car with 5 seats. 
    This is a Volvo truck with a load capacity of 1000 tons. 
    This is a Honda car with 4 seats.
```

## Soubory k odevzdání
- `Vehicle.java`
- `Car.java`
- `Truck.java`
- `VehicleMain.java`

Tento program by měl splňovat všechny výše uvedené požadavky a měl by být schopen vygenerovat správný výstup podle zadaných parametrů vozidel.



