package com.crownpay.core.wallet;

import com.crownpay.core.coins.CoinType;

import java.io.Serializable;

/**
 * @author John L. Jegutanis
 */
public interface AbstractAddress extends Serializable {
    CoinType getType();
    String toString();
    long getId();
}
