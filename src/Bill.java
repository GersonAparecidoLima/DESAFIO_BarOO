public class Bill {
    // Atributos
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    // Constantes para preços
    private static final double BEER_PRICE = 5.0;       // Preço por cerveja
    private static final double SOFTDRINK_PRICE = 3.0;  // Preço por refrigerante
    private static final double BARBECUE_PRICE = 7.0;   // Preço por churrasco
    private static final double COVER_CHARGE = 4;       // Taxa de couvert
    private static final double TICKET_PRICE_MALE = 10.0;  // Preço do ingresso para homens
    private static final double TICKET_PRICE_FEMALE = 8.0;  // Preço do ingresso para mulheres


    // Construtor
    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    // Método para calcular o custo da cobertura
    public double cover() {
        double consumptionCost = feeding();
        return consumptionCost > 30.0 ? 0.0 : COVER_CHARGE;
    }
 
    // Método para calcular o custo do consumo
    public double feeding() {
        return (beer * BEER_PRICE) + (barbecue * BARBECUE_PRICE) + (softDrink * SOFTDRINK_PRICE);
    }
    

    // Método para calcular o custo do ingresso
    public double ticket() {
        if (gender == 'M' || gender == 'm') {
            return TICKET_PRICE_MALE;
        } else if (gender == 'F' || gender == 'f') {
            return TICKET_PRICE_FEMALE;
        } else {
            throw new IllegalArgumentException("Gênero inválido. Use 'M' para masculino ou 'F' para feminino.");
        }
    }

    // Método para calcular o custo total
    public double total() {
        return cover() + feeding() + ticket();
    }


}

