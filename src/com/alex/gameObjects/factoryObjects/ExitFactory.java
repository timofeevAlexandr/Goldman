package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.objects.Coordinate;
import com.alex.gameObjects.objects.Exit;

class ExitFactory implements GameObjectFactory {

    @Override
    public AbstractGameObject getGameObject(Coordinate coordinate) {
        return new Exit(coordinate);
    }
}
