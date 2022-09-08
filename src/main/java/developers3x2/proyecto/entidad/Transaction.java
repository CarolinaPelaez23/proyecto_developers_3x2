package developers3x2.proyecto.entidad;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction", nullable = false)
    private long id;
    @Column(name = "concept")
    private String concept;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "createAt")
    private Date createdAt;
    @Column(name = "updateAt")
    private Date  updateAt;
    @Column(name = "estado", nullable = false)
    private boolean estado;


    public Transaction() {

    }
    public Transaction(String concept, Double amount, boolean estado) {
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
