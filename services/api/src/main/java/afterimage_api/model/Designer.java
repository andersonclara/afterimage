package afterimage_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "designers")
public class Designer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String country;
    private Integer yearFounded;

    public Designer() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getYearFounded() {
        return yearFounded;
    }

    public Designer(String name, String country, Integer yearFounded) {
        this.name = name;
        this.country = country;
        this.yearFounded = yearFounded;
    }
}
