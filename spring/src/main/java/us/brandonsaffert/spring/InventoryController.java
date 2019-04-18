package us.brandonsaffert.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryController {
    @RequestMapping("/items")
    public List<Inventory> getAllSongs() {
        List<Inventory> items = new ArrayList<Inventory>();
        items.add(new Inventory("Roses",1));
        items.add(new Inventory("Tulips",2));
        items.add(new Inventory("Daffodils", 3));
        return items;
    }
}