import ColorModels.CMYK;
import ColorModels.Color;
import ColorModels.HSV;
import ColorModels.RGB;
import Device.GraphicEditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CMYK cmyk = new CMYK();
        RGB rgb = new RGB();
        HSV hsv = new HSV();

        GraphicEditor graphicEditor;
        Color color = null;

        System.out.println("""
                1. RGB
                2. CMYK
                3. HSV
                """);
        switch (scanner.nextInt()){
            case 1 -> color = rgb;
            case 2 -> color = cmyk;
            case 3 -> color = hsv;
        }
        graphicEditor = new GraphicEditor(color);
        graphicEditor.conclusion();

    }
}