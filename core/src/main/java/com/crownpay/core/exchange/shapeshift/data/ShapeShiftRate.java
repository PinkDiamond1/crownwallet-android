package com.crownpay.core.exchange.shapeshift.data;

import com.crownpay.core.coins.CoinID;
import com.crownpay.core.coins.CoinType;
import com.crownpay.core.util.ExchangeRate;
import com.crownpay.core.util.ExchangeRateBase;

import org.json.JSONObject;

import static com.crownpay.core.Preconditions.checkState;

/**
 * @author John L. Jegutanis
 */
public class ShapeShiftRate extends ShapeShiftPairBase {
    public final ExchangeRate rate;

    public ShapeShiftRate(JSONObject data) throws ShapeShiftException {
        super(data);
        if (!isError) {
            try {
                String[] pairs = pair.split("_");
                checkState(pairs.length == 2);
                CoinType typeFrom = CoinID.typeFromSymbol(pairs[0]);
                CoinType typeTo = CoinID.typeFromSymbol(pairs[1]);
                rate = new ShapeShiftExchangeRate(typeFrom, typeTo,
                        data.getString("rate"), data.optString("minerFee", null));
            } catch (Exception e) {
                throw new ShapeShiftException("Could not parse object", e);
            }
        } else {
            rate = null;
        }
    }
}
