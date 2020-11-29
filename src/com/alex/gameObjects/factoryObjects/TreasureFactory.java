package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.objects.Coordinate;
import com.alex.gameObjects.objects.Treasure;

class TreasureFactory implements GameObjectFactory {
    @Override
    public AbstractGameObject getGameObject(Coordinate coordinate) {
        return new Treasure(coordinate);
    }
}
