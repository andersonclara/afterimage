package afterimage_api.controller;

import afterimage_api.model.Designer;
import afterimage_api.service.DesignerService;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

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

    @GetMapping("/{id}")
    public ResponseEntity<Designer> getDesignerById(@PathVariable Long id) {
        Designer designer = designerService.getDesignerById(id);
        if (designer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(designer);
    }
}