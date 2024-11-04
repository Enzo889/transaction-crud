
package com.transaction.transaction.logic;

import com.transaction.transaction.persistence.PersistenceController;
import java.util.List;

public class Controller {

    //Se crea un objeto PersisControl de la clase PersistenceController que será utilizado para delegar las operaciones de persistencia.
    PersistenceController PersisControl = new PersistenceController();
    
    //Llama al método addTransaction del controlador de persistencia (PersisControl) para guardar la transacción en la base de datos.
    public void addTransaction(int idUser, int idModule, int idForms, String queryType, String oldValue, String newValue, int idUserCreate, int idUserUpdate) {
       
        Transaction tran = new Transaction();
        
        tran.setIdUser(idUser);
        tran.setIdModule(idModule);
        tran.setIdForms(idForms);
        tran.setQueryType(queryType);
        tran.setOldValue(oldValue);
        tran.setNewValue(newValue);
        tran.setIdUserCreate(idUserCreate);
        tran.setIdUserUpdate(idUserUpdate);
        
        PersisControl.addTransaction(tran);
        
    }

    public List<Transaction> getData() {
        return PersisControl.getData();

    }

    public void deleteTransaction(int idTransaction) {
        PersisControl.deleteTransaction(idTransaction);
    }

 
    public Transaction getDataToUpdate(int idTransaction) {
        return PersisControl.getDataToUpdate(idTransaction);
    }

    public void updateTransaction(Transaction tran, int idUser, int idModule, int idForms, String queryType, String oldValue, String newValue, int idUserCreate, int idUserUpdate) {
        
        tran.setIdUser(idUser);
        tran.setIdModule(idModule);
        tran.setIdForms(idForms);
        tran.setQueryType(queryType);
        tran.setOldValue(oldValue);
        tran.setNewValue(newValue);
        tran.setIdUserCreate(idUserCreate);
        tran.setIdUserUpdate(idUserUpdate);
        
        PersisControl.updateTransaction(tran);
    }
    
}
