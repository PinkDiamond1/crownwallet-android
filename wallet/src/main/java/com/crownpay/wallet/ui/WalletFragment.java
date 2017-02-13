package com.crownpay.wallet.ui;

import android.support.v4.app.Fragment;

import com.crownpay.core.wallet.WalletAccount;

/**
 * @author John L. Jegutanis
 */
public abstract class WalletFragment extends Fragment implements ViewUpdateble {
    abstract public WalletAccount getAccount();
}
