import java.util.ArrayList;

public class StringInverter implements StringTransformer {

    public StringInverter(){}

    @Override
    public void execute(StringDrink drink) {
        StringBuilder inverter = new StringBuilder(drink.getText());
        drink.setText(inverter.reverse().toString());
    }
}

/*
        ArrayList<Character> inverter = new ArrayList<>();
        for (Character letter : drink.getText().toCharArray()) {
            inverter.add(0, letter);
        }
        inverter.toString();
        drink.setText(inverter);
        */