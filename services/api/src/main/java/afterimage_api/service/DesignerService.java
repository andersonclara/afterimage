package afterimage_api.service;

import afterimage_api.model.Designer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignerService {

    private final List<Designer> designers = List.of(
        new Designer(1L, "Prada", "Italy", 1913),
        new Designer(2L, "Miu Miu", "Italy", 1993),
        new Designer(3L, "Saint Laurent", "France", 1961),
        new Designer(4L, "Loewe", "Spain", 1846)
    );

    public List<Designer> getAllDesigners() {
        return designers;
    }
}