public class ConvertVariables {
    public static void main(String[] args) {
        // TODO: 2023-04-24 convert String to primitive data type
        System.out.println("====================================");
        System.out.println("convert from String to primitive data type");
        System.out.println("====================================");

        String _boolean = "true";
        String _decimal = "2.56";
        String _int = "395";
        String _float = "2.56f";

        System.out.println("type boolean: "+ Boolean.parseBoolean(_boolean));
        System.out.println("type double: "+ Double.parseDouble(_decimal));
        System.out.println("type int: "+ Integer.parseInt(_int));
        System.out.println("type float: "+ Float.parseFloat(_float));

        // TODO: 2023-04-24 convert primitive to String
        System.out.println("====================================");
        System.out.println("convert from primitive data to String");
        System.out.println("====================================");

        boolean isCorrect = true;
        double statureDouble = 1.55;
        int age = 26;
        float statureFloat = 1.55f;

        System.out.println("boolean to String: "+ Boolean.toString(isCorrect));
        System.out.println("double to String: "+ Double.toString(statureDouble));
        System.out.println("int to String: "+ Integer.toString(age));
        System.out.println("float to String "+ Float.toString(statureFloat));

        // TODO: 2023-04-24 conversion between primitive data
        System.out.println("====================================");
        System.out.println("conversion between primitive data");
        System.out.println("====================================");

        int i = 400;

        short shortI = (short) i;
        long longI = i;
        char charI = (char) i;

        System.out.println("shortI: "+ shortI);
        System.out.println("longI: "+ longI);
        System.out.println("charI: "+ charI);

    }
}
