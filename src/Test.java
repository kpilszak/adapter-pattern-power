public class Test {

    public static void main(String[] args) {
        PolishPlugConnector plugConnector = new PolishPlugConnector() {
            @Override
            public void giveElectricity() {

            }
        };
        USAElectricalSocket electricalSocket = new USAElectricalSocket();
        USAPlugConnector usaAdapter = new PolishToUSAPlugConnectorAdapter(plugConnector);
        electricalSocket.plugIn(usaAdapter);
    }

}
