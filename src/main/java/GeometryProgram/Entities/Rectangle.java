package GeometryProgram.Entities;

import GeometryProgram.Figures;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements Figures {
    private int side;
    private int height;

    @Override
    public void calculateArea() {
        int area = side * height;
        System.out.println("The area of your rectangle is: " + area);
    }
}
