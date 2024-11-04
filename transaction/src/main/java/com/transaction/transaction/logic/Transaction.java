package com.transaction.transaction.logic;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {
    
    @Id
    @Column(name = "id_transaction")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTransaction;
    
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_module")
    private int idModule;
    @Column(name = "id_forms")
    private int idForms;
    @Column(name = "query_type")
    private String queryType;
    @Column(name = "old_value")
    private String oldValue;
    @Column(name = "new_value")
    private String newValue;
    @Column(name = "id_user_create")
    private int idUserCreate;
    @Column(name = "id_user_update")
    private int idUserUpdate;
    
    @Column(name = "date_create", updatable = false)
    private java.sql.Timestamp dateCreate;
    
    @Column(name = "date_update")
    private java.sql.Timestamp dateUpdate;

    public Transaction() {
    }

    public Transaction(int idTransaction, int idUser, int idModule, int idForms, String queryType, String oldValue, String newValue, int idUserCreate, int idUserUpdate, Timestamp dateCreate, Timestamp dateUpdate) {
        this.idTransaction = idTransaction;
        this.idUser = idUser;
        this.idModule = idModule;
        this.idForms = idForms;
        this.queryType = queryType;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.idUserCreate = idUserCreate;
        this.idUserUpdate = idUserUpdate;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public int getIdForms() {
        return idForms;
    }

    public void setIdForms(int idForms) {
        this.idForms = idForms;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public int getIdUserCreate() {
        return idUserCreate;
    }

    public void setIdUserCreate(int idUserCreate) {
        this.idUserCreate = idUserCreate;
    }

    public int getIdUserUpdate() {
        return idUserUpdate;
    }

    public void setIdUserUpdate(int idUserUpdate) {
        this.idUserUpdate = idUserUpdate;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    
    
    @PrePersist
    protected void onCreate() {
        dateCreate = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        dateUpdate = new Timestamp(System.currentTimeMillis());
    }
}
