package com.dp.behavioral.strategy;

/**
 * Created by Administrator on 2017/1/12.
 */
public class AirPlaneStrategy implements AbstractStrategy{
    @Override
    public String getTakeOffFeature() {
        return "AirPlane: LongDistanceTakeOff";
    }

    @Override
    public String getFlyFeature() {
        return "AirPlane: SubSonicFly";
    }
}
