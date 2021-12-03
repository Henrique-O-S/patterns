import java.util.ArrayList;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        ArrayList<Character> changer = new ArrayList<>();
        for(Character letter : drink.getText().toCharArray()) {
            if(Character.isLowerCase(letter))
                changer.add(Character.toUpperCase(letter));
            else
                changer.add(Character.toLowerCase(letter));
        }
        String s = "";
        for(Character letter : changer){
            s += letter;
        }
        drink.setText(s);
    }
}
