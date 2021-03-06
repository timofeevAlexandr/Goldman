package com.alex.gameObjects.abstracts;


import com.alex.gameObjects.enums.GameObjectType;
import com.alex.gameObjects.interfaces.StaticObject;
import com.alex.gameObjects.objects.Coordinate;
import javax.swing.ImageIcon;

/**
 * класс, который отвечает за любой объект, созданный в игре. задает все общие
 * характеристики объектов в игре
 */
public abstract class AbstractGameObject implements StaticObject {
    
    private GameObjectType type;// все объекты будут иметь тип
    private Coordinate coordinate;// все объекты будут иметь координаты положения
    
    private ImageIcon icon = getImageIcon("/com/alex/gui/icons/noicon.png");// изображение по-умолчанию

    protected AbstractGameObject() {// частый вопрос - нужен ли public конструктор в абстрактном классе
    }

    public void setIcon(ImageIcon currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    
    protected ImageIcon getImageIcon(String path){
        return new ImageIcon(getClass().getResource(path));
    }
    
    @Override
    public GameObjectType getType() {
        return type;
    }

    protected void setType(GameObjectType type) {
        this.type = type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    protected void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

   
}
