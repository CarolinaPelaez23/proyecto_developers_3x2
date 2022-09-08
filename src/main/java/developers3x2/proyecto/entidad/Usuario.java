package developers3x2.proyecto.entidad;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Users")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user", nullable = false)
    private long idUser;
    @Column(name="email", nullable = false)
    private String email;
    @OneToOne
    @JoinColumn(name="id_profile")
    private Profile profile;
    @Column(name="id_rol", nullable = false)
    private RoleName role;
    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Enterprise enterprise;
    @OneToMany
    @JoinColumn(name="id_transaction")
    private List<Transaction> transaction;
    @Column(name="updateAt")
    private Date updateAt;
    @Column(name="createAt")
    private Date createdAt;
    @Column(name="estado", nullable = false)
    private boolean estado;

    public Usuario() {
    }

    public Usuario(long idUser, String email, RoleName role, Enterprise enterprise, boolean estado) {
        this.idUser = idUser;
        this.email = email;
        this.role = role;
        this.transaction = new ArrayList<Transaction>();
        this.enterprise = enterprise;
        this.createdAt = new Date();
        this.estado = estado;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
        setUpdateAt(new Date());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        setUpdateAt(new Date());
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile perfil) {
        this.profile = perfil;
        setUpdateAt(new Date());
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
        this.role = role;
        setUpdateAt(new Date());
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        setUpdateAt(new Date());
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
        setUpdateAt(new Date());
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        setUpdateAt(new Date());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprise=" + enterprise.getName() +
                ", transaction=" + transaction +
                ", updateAt=" + updateAt +
                ", createdAt=" + createdAt +
                ", estado=" + estado +
                '}';
    }
}

