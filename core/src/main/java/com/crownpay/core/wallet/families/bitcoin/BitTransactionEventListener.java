package com.crownpay.core.wallet.families.bitcoin;

import com.crownpay.core.network.AddressStatus;
import com.crownpay.core.network.ServerClient.UnspentTx;
import com.crownpay.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
