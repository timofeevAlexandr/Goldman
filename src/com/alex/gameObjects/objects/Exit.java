package com.alex.gameObjects.objects;


import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/alex/gui/icons/exit.png"));
    }
}
