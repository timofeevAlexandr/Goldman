package com.alex.gameObjects.objects;


import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);        
        super.setIcon(getImageIcon("/com/alex/gui/icons/wall.png"));
    }
}
