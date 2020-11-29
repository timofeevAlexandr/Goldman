package com.alex.mapObjects.factoryObjects;

import com.alex.mapObjects.abstracts.AbstractGameMapObject;
import com.alex.mapObjects.enums.LocationType;
import com.alex.mapObjects.objects.FSGameMap;

public enum GetMapObject {
    INSTANCE;

    public static AbstractGameMapObject getObject(LocationType locationType){
        switch (locationType){
            case FS:
                return new FSGameMap();
            case DB:
                throw new IllegalArgumentException("No valid map type " + locationType);
            default:
                throw new IllegalArgumentException("No valid map type " + locationType);
        }
    }
}
