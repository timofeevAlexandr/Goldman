/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.gameObjects.interfaces;

import com.alex.gameObjects.enums.GameObjectType;
import com.alex.gameObjects.objects.Coordinate;

import javax.swing.ImageIcon;

/**
 *
 * @author Alex
 */
public interface StaticObject {
 
    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}
