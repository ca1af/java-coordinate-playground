package calculator;

public class Line {
    private final Dot firstDot;
    private final Dot secondDot;
    public Line(String input) {
        validateInput(input);
        String[] split = input.split("-");
        try{
            this.firstDot = new Dot(split[0]);
            this.secondDot = new Dot(split[1]);
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    private void validateInput(String input) {
        if (!input.contains("-")){
            throw new IllegalArgumentException();
        }
    }

    public Dot getFirstDot() {
        return firstDot;
    }

    public Dot getSecondDot() {
        return secondDot;
    }

    public double getDotsDistance(){
        return this.firstDot.getDistanceBetween(secondDot);
    }
}