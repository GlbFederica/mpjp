package s054;

public class Dog implements BarkAndWag {
    @Override
    public String bark() { //override
        return "woof!";
    }

    public String bark(int count) { //overload
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}