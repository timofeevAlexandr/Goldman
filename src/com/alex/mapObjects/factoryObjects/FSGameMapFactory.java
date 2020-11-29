package com.alex.mapObjects.factoryObjects;

import com.alex.mapObjects.abstracts.AbstractGameMapObject;
import com.alex.mapObjects.objects.FSGameMap;

public class FSGameMapFactory implements MapObjectFactory {
    @Override
    public AbstractGameMapObject getMap() {
        return new FSGameMap();
    }
}
