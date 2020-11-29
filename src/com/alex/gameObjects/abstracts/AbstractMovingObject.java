package com.alex.gameObjects.abstracts;

import com.alex.gameObjects.interfaces.MovingObject;
import javax.swing.ImageIcon;

/**
 * класс, который отвечает за любой движущийся объект. наследуется от класса
 * AbstractGameObject с добавлением функций движения
 */
public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObject {

    
    private ImageIcon iconLeft;
    private ImageIcon iconUp;
    private ImageIcon iconDown;
    private ImageIcon iconRight;


    protected void setIconLeft(ImageIcon iconLeft) {
        this.iconLeft = iconLeft;
    }

    protected void setIconUp(ImageIcon iconUp) {
        this.iconUp = iconUp;
    }

    protected void setIconDown(ImageIcon iconDown) {
        this.iconDown = iconDown;
    }

    protected void setIconRight(ImageIcon iconRight) {
        this.iconRight = iconRight;
    }

    @Override
    public ImageIcon getIconLeft() {
        return iconLeft;
    }

    @Override
    public ImageIcon getIconUp() {
        return iconUp;
    }

    @Override
    public ImageIcon getIconDown() {
        return iconDown;
    }

    @Override
    public ImageIcon getIconRight() {
        return iconRight;
    }
}
