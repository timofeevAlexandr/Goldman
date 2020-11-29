package com.alex.gameObjects.objects;


import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.abstracts.AbstractMovingObject;
import com.alex.gameObjects.enums.GameObjectType;
import com.alex.gameObjects.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconRight(getImageIcon("/com/alex/gui/icons/monsterRight.jpg"));
        super.setIconLeft(getImageIcon("/com/alex/gui/icons/monsterLeft.jpg"));
        super.setIconUp(getImageIcon("/com/alex/gui/icons/monsterUp.jpg"));
        super.setIconDown(getImageIcon("/com/alex/gui/icons/monsterDown.jpg"));

        super.setIcon(getIconLeft());// по-умолчанию будет использоваться эта иконка
    }

    @Override
    public void move(MovingDirection direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
