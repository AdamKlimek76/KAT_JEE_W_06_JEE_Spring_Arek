![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)



## Zadanie 1 - rozwiązywane z wykładowcą

1. Zdefiniuj w klasie konfiguracji `ViewResolver` - skorzystaj z przykładu z prezentacji.
2. Utwórz widok o nazwie `home.jsp` ze statyczną zawartością html znajdujący się w lokalizacji określonej w konfiguracji `ViewResolver`:
    ```html
    <h1>Witaj w widoku</h1>
    ```
3. W kontrolerze `HelloController` utwórz akcję `helloView`, dostępną pod adresem `/helloView`,
 która wyświetli ten widok.



## Zadanie 2 - rozwiązywane z wykładowcą

1. W widoku  `home.jsp` dodaj tag `style`. Tag powinien zawierać selector `body`, który ustawia dwie właściwości `color` i `backgroundColor`.
2. Wartościami tych parametrów powinny być wartości `color` i `backgroundColor`, przekazane z kontrolera.
4. W akcji sprawdzaj aktualną godzinę i jeśli jest między 8:00 a 20:00 podmieniał tekst `color` i `backgroundColor` odpowiednio na `black` i `white`.
5. Gdy godzina wypada między 20:00 a 8:00, podmień wartości właściwości odwrotnie.
6. Uruchom stronę i zobacz efekt. Tekst powinien być czarny, a strona biała.
7. Zmodyfikuj program tak, aby nie brał pod uwagę aktualnej godziny, tylko na sztywno wpisz godzinę 1:00 w nocy.
8. Wyświetl stronę i zobacz efekt. Tekst powinien być biały, a strona czarna.


## Zadanie 3

1. Utwórz kontroler o nazwie `MultiplyController`.
2. Utwórz nową akcję multiply, dostępną pod adresem `/multiply`.
3. Akcja ma pobierać jeden parametr w URL o nazwie `size`.
4. Ustaw domyślną wartość tego parametru na wartość 10.
5. Przekaż zmienną do widoku a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


| x | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|
|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 1 | 2 | 3 |   |   |   |   |   |   |   |
| 2 |       ...                             |
| 3 |                                       |
| 4 |                                       |
| ...                                       |
| 9 | 9 |18 |27 |36 |45 |54 |63 |72 |81 |90 |
| 10|...|



## Zadanie 4

1. W kontrolerze `MultiplyController` utwórz akcję `/paramMultiply/<rows>/<cols>`,
2. Akcja ma przyjmować 2 parametry `<rows>` oraz `<cols>`.
3. Przekaż zmienne do widoku, a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:


Parametr rows = 10, cols =2.

| x | 1 | 2 |
|---|---|---|
| 1 | 1 | 2 |
| 2 | 2 | 4 |
| 3 | 3 | 6 |
| 4 | 4 | 8 |
| ...
| 9 | 9 | 18|
| 10| 10| 20|
