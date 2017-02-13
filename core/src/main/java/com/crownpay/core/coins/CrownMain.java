package com.crownpay.core.coins;

import com.crownpay.core.coins.families.BitFamily;

/**
 * @author Hypermist/Extrememist
 */
public class CrownMain extends BitFamily {
    private CrownMain() {
        id = "crown.main";

        addressHeader = 0;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "Crown";
        symbol = "CRW";
        uriScheme = "crown";
        bip44Index = 99;
        unitExponent = 8;
        feeValue = value(12000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 CRW
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Crown Signed Message:\n");
    }

    private static CrownMain instance = new CrownMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
