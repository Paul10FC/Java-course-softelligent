package GeometryProgram.Entities;

import GeometryProgram.Figures;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Triangle implements Figures {
    private int base;
    private int height;

    @Override
    public void calculateArea() {
        int area = (base * height) / 2;
        System.out.println("The area of your triangle is: " + area);
    }
}
