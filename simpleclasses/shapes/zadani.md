# Zadání úkolu: Geometrické tvary v Javě

Vaším úkolem je vytvořit hierarchii tříd reprezentujících různé geometrické tvary v Javě. Každý tvar bude mít schopnost vypočítat svůj obvod a obsah. Na závěr bude implementována hlavní třída pro testování vytvořených objektů.

## Požadavky

### 1. Rozhraní `Shape`
- Vytvořte rozhraní s názvem `Shape`, které bude obsahovat:
  - **Metody:**
    - `computePerimeter()`: metoda pro výpočet obvodu tvaru.
    - `computeArea()`: metoda pro výpočet obsahu tvaru.

### 2. Třída `Rectangle`
- Vytvořte třídu `Rectangle`, která implementuje rozhraní `Shape` a bude obsahovat:
  - **Atributy:**
    - `width`: šířka obdélníku.
    - `height`: výška obdélníku.
  - **Konstruktor:**
    - Konstruktor, který přijímá parametry `width` a `height` a inicializuje je.
  - **Metody:**
    - Implementace metody `computePerimeter()`, která vypočítá obvod obdélníku podle vzorce: 
    ```
    perimeter = 2 * (width + height)
    ```
    - Implementace metody `computeArea()`, která vypočítá obsah obdélníku podle vzorce:
    ```
    area = width * height
    ```

### 3. Třída `Circle`
- Vytvořte třídu `Circle`, která implementuje rozhraní `Shape` a bude obsahovat:
  - **Atributy:**
    - `radius`: poloměr kruhu.
  - **Konstruktor:**
    - Konstruktor, který přijímá parametr `radius` a inicializuje ho.
  - **Metody:**
    - Implementace metody `computePerimeter()`, která vypočítá obvod kruhu podle vzorce:
    ```
    perimeter = 2 * π * radius
    ```
    - Implementace metody `computeArea()`, která vypočítá obsah kruhu podle vzorce:
    ```
    area = π * radius^2
    ```

### 4. Třída `ShapesMain`
- Vytvořte třídu `ShapesMain`, která bude obsahovat:
  - **Pole objektů typu `Shape`**, které bude obsahovat různé instance tříd `Circle` a `Rectangle`.
  - **Iteraci** přes pole objektů a volání metod `computePerimeter()` a `computeArea()` pro každý objekt.
  - **Výstup**, který vypíše obvod a obsah každého tvaru.

### 5. Příklad výstupu
- Program by měl generovat následující výstup:
```
Shape 1: Perimeter: 31.41592653589793 Area: 78.53981633974483
Shape 2: Perimeter: 14.0 Area: 12.0
Shape 3: Perimeter: 43.982297150257104 Area: 153.93804002589985
```

## Soubory k odevzdání
- `Shape.java`
- `Rectangle.java`
- `Circle.java`
- `ShapesMain.java`

Tento program by měl splňovat všechny výše uvedené požadavky a měl by být schopen vygenerovat správný výstup podle zadaných parametrů tvarů.