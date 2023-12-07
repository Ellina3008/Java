package Device;

import ColorModels.Color;

public class GraphicEditor extends Device{

    public GraphicEditor(Color color) {
        super(color);
    }

    @Override
    public void conclusion() {
        color.show("Цветовая схема выбрана ");
    }
}
