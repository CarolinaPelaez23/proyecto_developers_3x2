package developers3x2.proyecto.entidad;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="empresas")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empresa", nullable = false)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="document")
    private String document;
    @Column(name="phone")
    private String phone;
    @Column(name="address")
    private String address;
    @OneToMany
    @JoinColumn(name="id_transaction")
    private List<Transaction> transactions;
    @Column(name="createAt")
    private Date createdAt = new Date();
    @Column(name="updateAt")
    private Date updatedAt;
    @Column(name="estado")
    private boolean estado;



    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
        setUpdatedAt(new Date());
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        setUpdatedAt(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setUpdatedAt(new Date());
    }


    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
        setUpdatedAt(new Date());
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        setUpdatedAt(new Date());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        setUpdatedAt(new Date());
    }


    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        System.out.println(transactions);
        this.transactions = transactions;
        setUpdatedAt(new Date());
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
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
        return "Enterprise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", transactions=" + transactions +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", estado=" + estado +
                '}';
    }
}
