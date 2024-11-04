package com.transaction.transaction.logic;

import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-02T18:23:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Integer> idUser;
    public static volatile SingularAttribute<Transaction, String> newValue;
    public static volatile SingularAttribute<Transaction, Integer> idForms;
    public static volatile SingularAttribute<Transaction, Timestamp> dateUpdate;
    public static volatile SingularAttribute<Transaction, Integer> idUserCreate;
    public static volatile SingularAttribute<Transaction, Integer> idUserUpdate;
    public static volatile SingularAttribute<Transaction, String> oldValue;
    public static volatile SingularAttribute<Transaction, Integer> idModule;
    public static volatile SingularAttribute<Transaction, Timestamp> dateCreate;
    public static volatile SingularAttribute<Transaction, Integer> idTransaction;
    public static volatile SingularAttribute<Transaction, String> queryType;

}