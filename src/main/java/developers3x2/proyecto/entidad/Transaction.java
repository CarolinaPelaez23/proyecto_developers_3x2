package developers3x2.proyecto.entidad;

import java.util.Date;
public class Transaction {
    private long id;
    private String concept;
    private Double amount;
    //private Usuario user;
    //private Enterprise enterprise;
    private Date createdAt;
    private Date  updateAt;
    private boolean estado;

    public Transaction(long id, String concept, Double amount, boolean estado) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        //this.user = user;
        //this.enterprise = enterprise;
        this.createdAt  = new Date();
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        setUpdateAt(new Date());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        setUpdateAt(new Date());
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
        setUpdateAt(new Date());
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
        setUpdateAt(new Date());
    }

    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", estado=" + estado +
                '}';
    }
}
