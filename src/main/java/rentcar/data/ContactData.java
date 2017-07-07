package rentcar.data;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT_DATA")
public class ContactData {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", updatable = true, nullable = true)
    private String name;

    @Column(name = "EMAIL", updatable = true, nullable = true, length = 45)
    private String email;

    @Column(name = "PHONE", updatable = true, nullable = true, length = 45)
    private String phone;

    @Column(name = "SUBJECT", updatable = true, nullable = false, length = 45)
    private String subject;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
