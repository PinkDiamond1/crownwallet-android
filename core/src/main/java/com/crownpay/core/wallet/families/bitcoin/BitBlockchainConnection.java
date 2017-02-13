package com.crownpay.core.wallet.families.bitcoin;

import com.crownpay.core.network.AddressStatus;
import com.crownpay.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
