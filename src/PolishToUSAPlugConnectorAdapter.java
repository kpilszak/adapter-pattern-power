public class PolishToUSAPlugConnectorAdapter implements USAPlugConnector {

    private PolishPlugConnector plug;

    public PolishToUSAPlugConnectorAdapter(PolishPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }
}
