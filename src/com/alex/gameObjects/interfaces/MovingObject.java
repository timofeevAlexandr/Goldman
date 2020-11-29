/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.gameObjects.interfaces;

import javax.swing.ImageIcon;

import com.alex.gameObjects.abstracts.AbstractGameObject;
import com.alex.gameObjects.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject {
    
    void move(MovingDirection direction);
    
    void getMoveResult(AbstractGameObject objectInNewCoordinate);
    
    // иконки при движении в разные стороны
    ImageIcon getIconLeft();

    ImageIcon getIconUp();

    ImageIcon getIconDown();

    ImageIcon getIconRight();

   
   
}
