package afterimage_api.controller;

import afterimage_api.model.Designer;
import afterimage_api.service.DesignerService;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/designers")
public class DesignerController {

    private final DesignerService designerService;
    public DesignerController(DesignerService designerService) {
        this.designerService = designerService;
    }

    @GetMapping 
    public List<Designer> getAllDesigners() {
        return designerService.getAllDesigners();
    }
}