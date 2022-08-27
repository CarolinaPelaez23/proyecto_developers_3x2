package developers3x2.proyecto.entidad;

import java.util.Arrays;
import java.util.Date;

public class User {

    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise enterprise;
    private Transaction[] transaction;
    private Date updateAt;
    private Date createdAt;
    private boolean estado;

    public User(String email, Profile profile, Enum_RoleName role, Enterprise enterprise, boolean estado) {
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction[] transaction) {
        this.transaction = transaction;
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
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", profile=" + profile +
                ", role=" + role +
                ", enterprise=" + enterprise +
                ", transaction=" + Arrays.toString(transaction) +
                ", updateAt=" + updateAt +
                ", createdAt=" + createdAt +
                ", estado=" + estado +
                '}';
    }
}

