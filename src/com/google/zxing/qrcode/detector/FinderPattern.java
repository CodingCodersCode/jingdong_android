// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

public final class FinderPattern extends ResultPoint
{

    FinderPattern(float f, float f1, float f2)
    {
        super(f, f1);
        estimatedModuleSize = f2;
        count = 1;
    }

    boolean aboutEquals(float f, float f1, float f2)
    {
        boolean flag;
        if(Math.abs(f1 - getY()) <= f && Math.abs(f2 - getX()) <= f)
        {
            float f3 = Math.abs(f - estimatedModuleSize);
            if(f3 <= 1.0F || f3 / estimatedModuleSize <= 1.0F)
                flag = true;
            else
                flag = false;
        } else
        {
            flag = false;
        }
        return flag;
    }

    int getCount()
    {
        return count;
    }

    public float getEstimatedModuleSize()
    {
        return estimatedModuleSize;
    }

    void incrementCount()
    {
        count = 1 + count;
    }

    private int count;
    private final float estimatedModuleSize;
}
