import java.util.List;
import java.util.Optional;

interface Structure {
// zwraca dowolny element o podanym kolorze
Optional findBlockByColor(String color);

// zwraca wszystkie elementy z danego materiału
List findAllBlocksByMaterial(String material);

//zwraca liczbę wszystkich elementów tworzących strukturę
int count();
}
