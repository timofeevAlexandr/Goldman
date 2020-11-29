package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.objects.Coordinate;

public interface GameObjectFactory {
    AbstractGameObject getGameObject(Coordinate coordinate);
}
