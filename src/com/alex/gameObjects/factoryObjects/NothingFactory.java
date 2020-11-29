package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.objects.Coordinate;
import com.alex.gameObjects.objects.Nothing;

class NothingFactory implements GameObjectFactory {
    @Override
    public AbstractGameObject getGameObject(Coordinate coordinate) {
        return new Nothing(coordinate);
    }
}
