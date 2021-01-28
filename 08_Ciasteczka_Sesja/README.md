![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)



## Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz kontroler `SessionController`.
2. Sprawdź czy w sesji jest zapisana wartość pod kluczem  `loginStart`.
3. Jeżeli jest zapisana wyświetl ją - skorzystaj z adnotacji `@ResponseBody`.
4. Jeżeli nie ma wartości - wstaw bieżącą datę i godzinę.



## Zadanie 2 - rozwiązywane z wykładowcą

1. Utwórz klasę o nazwie `Product` - klasa ma zawierać właściwości:
    - typu String o nazwie `name`.
    - typu double o nazwie `price`.
2. Utwórz klasę o nazwie `CartItem` - klasa ma zawierać właściwości:
    - typu Integer o nazwie `quantity`.
    - typu Product o nazwie `product`.
3. Utwórz klasę o nazwie `Cart` - klasa ma zawierać właściwość:
    `private List<CartItem> cartItems;`
4. Ustal dla klasy `Cart` zasięg typu sesyjnego:
```java
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)       
``` 
5. Utwórz kontroler `CartController`, wstrzyknij komponent typu `Cart`.
6. Utwórz akcję dostępną pod adresem `/addtocart` :
````java
@RequestMapping("/addtocart")
@ResponseBody
public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
}
````
Utwórz w klasach odpowiednie konstruktory - tak by kod działał poprawnie.

7. Utwórz akcję dostępną pod adresem `/cart` w której wyświetlisz wszystkie produkty z koszyka.



## Zadanie 3

1. Zmodyfikuj zadanie 2 dodając do klasy produkt pole typu `Long` o nazwie `id`.
2. Utwórz komponent `ProduktDao`, a w niej metodę `getList()` , która będzie zwracała listę produktów, które można dodać do koszyka. 
3. Utwórz produkty wpisując własne dane, wstrzyknij komponent do kontrolera.
3. Zmodyfikuj metodę `/addtocart` tak by przyjmowała przyjmowała z `GET` parametry `id` oraz `quantity`, metoda ma pobrać z listy odpowiedni produkt i dodać określoną jego ilość do koszyka.
4. Jeżeli produkt już występuje w koszyku jego ilość ma się zwiększyć.
5. Dopisz w akcji dostępnej pod adresem `/cart` podsumowanie koszyka w postaci:
````
W koszyku jest <ilość pozycji> pozycji.
W koszyku jest <ilość produktów> produktów.
Wartość koszyka to: <wartość produktów>.
````


## Zadanie 4

1. Utwórz kontroler `CookieController`.
2. Utwórz akcję dostępną pod adresem `/setcookie/<value1>/<value2>`.  
3. Akcja ma pobrać wartości parametrów `value1` oraz `value2`, a następnie ustawić 
dwa ciasteczka o nazwach `cookie1` i wartości `value1` oraz `cookie2` i wartości `value2`. 
4. Dla ciasteczek ustaw wartość ścieżki jak w przykładzie: `cookie1.setPath("/");`
5. Utwórz akcję dostępną pod adresem `/getcookies`, która pobierze wartości ciasteczek.
6. Wykorzystaj 2 sposoby opisane w prezentacji - klasę `WebUtils` oraz adnotację `@CookieValue`.
7. Wyświetl pobrane dane.
