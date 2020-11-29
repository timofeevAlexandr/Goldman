package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.objects.Coordinate;
import com.alex.gameObjects.objects.GoldMan;

class GoldManFactory implements GameObjectFactory {
    @Override
    public AbstractGameObject getGameObject(Coordinate coordinate) {
        return new GoldMan(coordinate);
    }
}
