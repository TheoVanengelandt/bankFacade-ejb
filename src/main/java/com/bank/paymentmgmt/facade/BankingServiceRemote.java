/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.paymentmgmt.facade;

import com.bank.paymentmgmt.domain.Payment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author theo
 */
@Remote
public interface BankingServiceRemote extends BankingServiceEndpointInterface {
    
    public List<Payment> lookupAllStoredPayments();  // récupère tous les paiement stockés dans la Map du DAO.
            
    public Payment lookupStoredPayment(Long id);    // récupère un paiement en fonction de son identité.
            
    public Payment deleteStoredPayment(Long id);    // supprime de la Map un paiement.

}
