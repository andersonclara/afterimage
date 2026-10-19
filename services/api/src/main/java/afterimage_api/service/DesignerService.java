package afterimage_api.service;

import afterimage_api.model.Designer;
import org.springframework.stereotype.Service;

import java.util.List;
import afterimage_api.repository.DesignerRepository;

@Service
public class DesignerService {

    private final DesignerRepository designerRepository;

    public DesignerService(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    } 

    public List<Designer> getAllDesigners() {
        return designerRepository.findAll();
    }

    public Designer getDesignerById(Long id) {
        return designerRepository.findById(id).orElse(null);
    }
}