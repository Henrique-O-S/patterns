public class StringReplacer implements StringTransformer{
    private Character was;
    private Character is;

    public StringReplacer(Character was, Character is){
        this.was = was;
        this.is = is;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(was, is));
    }
}
