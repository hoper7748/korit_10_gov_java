package ex1.model;


import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Student {
    private String name;
    private int kor, eng, math;

    public int getTotal(){
        return 0;
    }

    public double getAverage(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "";
    }
}
