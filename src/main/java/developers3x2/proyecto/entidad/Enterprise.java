package developers3x2.proyecto.entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Enterprise {

    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private ArrayList<Usuario> users;
    private ArrayList<Transaction> transactions;
    private Date createdAt;
    private Date updatedAt;
    private boolean estado;

    public Enterprise(long id, String name, String document, String phone, String address,  boolean estado) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = new ArrayList<Usuario>();
        this.transactions = new ArrayList<Transaction>();
        this.createdAt  = new Date();
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
        setUpdatedAt(new Date());
    }

    public Enterprise(long id) {
        this.id = id;
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

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
        setUpdatedAt(new Date());
    }

    public void addUsers(Usuario user) {
        this.users.add(user);
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


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
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
