package com.crownpay.core.coins.families;

import com.crownpay.core.coins.CoinType;
import com.crownpay.core.wallet.AbstractAddress;
import com.crownpay.core.exceptions.AddressMalformedException;
import com.crownpay.core.wallet.families.bitcoin.BitAddress;

import org.bitcoinj.core.AddressFormatException;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
