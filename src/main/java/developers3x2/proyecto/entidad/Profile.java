package developers3x2.proyecto.entidad;

import java.util.Date;

public class Profile {

    private String id;
    private String image;
    private String phone;
    private User user;
    private Date createdAt;
    private Date updatedAt;

    public Profile(String id, String image, String phone, User user) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
