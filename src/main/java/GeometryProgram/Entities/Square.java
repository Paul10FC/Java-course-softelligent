package GeometryProgram.Entities;

import GeometryProgram.Figures;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Square implements Figures {
    private int side;

    @Override
    public void calculateArea() {
        int area = (side * side);
        System.out.println("The area of your square is " + area);
    }
}
