class BomLine {

    private final String componentCode;

    private final long quantityPerUnit;

    private final int lossPercent;



    BomLine(String componentCode, long quantityPerUnit, int lossPercent) {

        if (quantityPerUnit <= 0) {

            throw new IllegalArgumentException(

                "quantityPerUnit must be positive"

            );

        }



        if (lossPercent < 0 || lossPercent >= 100) {

            throw new IllegalArgumentException(

                "lossPercent must be between 0 and 99"

            );

        }



        this.componentCode = componentCode;

        this.quantityPerUnit = quantityPerUnit;

        this.lossPercent = lossPercent;

    }



    String componentCode() {

        return componentCode;

    }

}
public class main {

    public static void main(String[] args) {

        BomLine line = new BomLine("WOOD-A", 25, 120);



        System.out.println(

            "Created: " + line.componentCode()

        );

    }

}