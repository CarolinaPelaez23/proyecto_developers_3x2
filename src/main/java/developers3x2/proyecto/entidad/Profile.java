package developers3x2.proyecto.entidad;

import java.util.Date;

public class Profile {

    private String id;
    private String image;
    private String phone;
    private Usuario user;
    private Date createdAt;
    private Date updatedAt;
    private boolean estado;

    public Profile(String id, String image, String phone, Usuario user, boolean estado) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt  = new Date();
        this.estado = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        setUpdatedAt(new Date());
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        setUpdatedAt(new Date());
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        setUpdatedAt(new Date());
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
        setUpdatedAt(new Date());
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
