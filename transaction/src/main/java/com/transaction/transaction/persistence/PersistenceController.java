package com.transaction.transaction.persistence;

import com.transaction.transaction.logic.Transaction;
import com.transaction.transaction.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {

    TransactionJpaController transactionJpa = new TransactionJpaController();
    
    public void addTransaction(Transaction tran) {
        transactionJpa.create(tran);
    }

    public List<Transaction> getData() {
        return transactionJpa.findTransactionEntities();

    }

    public void deleteTransaction(int idTransaction) {
        try {
            transactionJpa.destroy(idTransaction);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Transaction getDataToUpdate(int idTransaction) {
        return transactionJpa.findTransaction(idTransaction);
    }

    public void updateTransaction(Transaction tran) {
        try {
            transactionJpa.edit(tran);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
