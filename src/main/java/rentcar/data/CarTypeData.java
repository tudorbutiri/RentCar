package rentcar.data;

import javax.persistence.*;

@Entity
@Table(name = "CAR_TYPE")
public class CarTypeData {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "NAME", updatable = true, nullable = false)
    private String name;

    @Column(name = "PRODUCER", updatable = true, nullable = false)
    private String producer;

    @Column(name = "TYPE", updatable = true, nullable = false)
    private String type;

    @Column(name = "AUTOMATIC", updatable = true, nullable = false)
    private String automatic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }
}
