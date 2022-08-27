package developers3x2.proyecto.entidad;

import java.util.Arrays;
import java.util.Date;

public class Usuario {

    private long idUser;
    private String email;
    private Profile profile;
    private RoleName role;
    private Enterprise enterprise;
    private Transaction[] transaction;
    private Date updateAt;
    private Date createdAt;
    private boolean estado;

    public Usuario(long idUser, String email, RoleName role, Enterprise enterprise, boolean estado) {
        this.idUser = idUser;
        this.email = email;
        this.role = role;
        this.enterprise = enterprise;
        this.createdAt = new Date();
        this.estado = estado;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
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

    public void setProfile(Profile perfil) {
        this.profile = perfil;
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
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
        return "Usuario{" +
                "idUser=" + idUser +
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

