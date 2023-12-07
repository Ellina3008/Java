package Device;

import ColorModels.Color;

public abstract class Device {
    public Color color;

    public Device(Color color) {
        this.color = color;
    }
    public abstract void conclusion();
}
