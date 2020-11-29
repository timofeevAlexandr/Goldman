package com.alex.gameObjects.factoryObjects;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.enums.GameObjectType;
import com.alex.gameObjects.objects.Coordinate;

public enum GetGameObject {
    INSTANCE;

    public static AbstractGameObject getObject(GameObjectType gameObjectType, Coordinate coordinate){
        switch (gameObjectType){
            case EXIT:
                return new ExitFactory().getGameObject(coordinate);
            case GOLDMAN:
                return new GoldManFactory().getGameObject(coordinate);
            case MONSTER:
                return new MonsterFactory().getGameObject(coordinate);
            case NOTHING:
                return new NothingFactory().getGameObject(coordinate);
            case TREASURE:
                return new TreasureFactory().getGameObject(coordinate);
            case WALL:
                return new WallFactory().getGameObject(coordinate);
                default:
                    throw new IllegalArgumentException("No valid game type " + gameObjectType);
        }
    }
}
