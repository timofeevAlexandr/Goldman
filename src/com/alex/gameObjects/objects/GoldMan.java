package com.alex.gameObjects.objects;


import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.abstracts.AbstractMovingObject;
import com.alex.gameObjects.enums.GameObjectType;
import com.alex.gameObjects.enums.MovingDirection;

/**
 * класс отвечает за работу объекта GOLDMAN - главный персонаж игры
 */
public class GoldMan extends AbstractMovingObject {

    private int totalScore = 0;// кол-во очков, собранных игроком
    private int turnsNumber = 0;// кол-во сделанных ходов

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);

        super.setIconDown(getImageIcon("/com/alex/gui/icons/goldmanDown.png"));
        super.setIconUp(getImageIcon("/com/alex/gui/icons/goldmanUp.png"));
        super.setIconLeft(getImageIcon("/com/alex/gui/icons/goldmanLeft.png"));
        super.setIconRight(getImageIcon("/com/alex/gui/icons/goldmanRight.png"));

        super.setIcon(super.getIconUp());
    }

    public void addSTotalcore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }


    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
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
