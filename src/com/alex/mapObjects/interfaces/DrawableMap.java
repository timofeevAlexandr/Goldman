package com.alex.mapObjects.interfaces;

import java.awt.Component;

import com.alex.mapObjects.abstracts.AbstractGameMapObject;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMapObject getGameMap();
    
    boolean drawMap();    

}
