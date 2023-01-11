public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean on;
    private int channelNumber = 1;
    private int volume = 1;
    private String[] tvStations = new String[90];

    public TV() {
        tvStations[0] = "tvn";
        tvStations[1] = "polsat";
        tvStations[2] = "tvp";
        tvStations[3] = "canal+";
        tvStations[4] = "espn";
        tvStations[5] = "abc";
        tvStations[6] = "markTV";
        tvStations[7] = "stacja 8";
        tvStations[8] = "stacja 9";
        tvStations[9] = "stacja 10";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannelnumber() {
        return channelNumber;
    }

    public boolean isOn() {
        return on;
    }

    public void displayStatus() {
        if (isOn()) {
            System.out.println("Telewizor włączony");
        } else {
            System.out.println("Telewizor wyłączony");
        }
        if (isOn()) {
            System.out.println("Numer kanału: " + getChannelnumber());
            if (tvStations[getChannelnumber() - 1] != null) {
                System.out.println("Nazwa kanału: " + tvStations[getChannelnumber() - 1]);
            }
            System.out.println("Ustawiona głośność: " + getVolume());
        }
        System.out.println();
    }

    @Override
    public void on() {
        if (!on) {
            this.channelNumber = 1;
            this.volume = 1;
        }
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public void channelDown() {
        if (isOn()) {
            this.channelNumber--;
            if (channelNumber == -1) {
                channelNumber = 99;
            }
        }

    }

    @Override
    public void channelUp() {
        if (isOn()) {
            this.channelNumber++;
            if (channelNumber == 100) {
                channelNumber = 1;
            }
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if (isOn()) {
            if (channelNo < 1 | channelNo > 99) {
                System.out.println("Wybierz kanał od 1 do 99!");
            } else {
                channelNumber = channelNo;
            }
        }
    }

    @Override
    public void volumeUp() {
        if (on & volume != 10) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (on & volume != 1) {
            volume--;
        }
    }

    public void displayStations() {
        int numer = 0;
        for (String string : tvStations) {
            numer++;
            if (string != null) {
                System.out.println("Numer stacji: " + numer + ", Nazwa stacji: " + string);
            }
        }
    }
}
