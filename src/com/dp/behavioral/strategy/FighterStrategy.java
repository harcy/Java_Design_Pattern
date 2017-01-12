package com.dp.behavioral.strategy;

/**
 * Created by Administrator on 2017/1/12.
 */
public class FighterStrategy implements AbstractStrategy {
    @Override
    public String getTakeOffFeature() {
        return "Fighter: LongDistanceTakeOff";
    }

    @Override
    public String getFlyFeature() {
        return "Fighter: SuperSonicFly";
    }
}
