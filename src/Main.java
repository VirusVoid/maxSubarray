
public class Main {
    public static void main(String[] args) {
        int Price[] = {10, 11, 7, 10, 6};
        priceMas.prn(Price);
        int Delta[] = priceMas.subMas(Price);
        priceMas.prn(Delta);
        priceMas.searchSubmas(Price, Delta);
    }
}
