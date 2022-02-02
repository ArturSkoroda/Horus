import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure {

    private List blocks;

    @Override
    public Optional findBlockByColor(String color) {
        Optional <String> findByCollor= blocks.stream()
                .findAny(e->blocks.equals(color))
                .collect(Collectors.toList());

        return Optional.empty();
    }

    @Override
    public List findAllBlocksByMaterial(String material) {
        List <String> materialList =blocks.stream()
                .filter(equals(blocks.equals(material)))
                .collect(Collectors.toList());
        return materialList;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}

