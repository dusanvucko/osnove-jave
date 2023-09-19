package d18_09_2023;

public class TimeControl extends Control {

    private boolean controlSide;
    public TimeControl(boolean controlSide) {
        this.controlSide = controlSide;
    }

    public boolean isControlSide() {
        return controlSide;
    }

    public void setControlSide(boolean controlSide) {
        this.controlSide = controlSide;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int trenutnoVreme = videoPlayer.getTrenutnoVremeVidea();
        if (this.controlSide) {

            if (trenutnoVreme + 15 > videoPlayer.getDuzinaVidea()){
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
            }
            else {
                videoPlayer.setTrenutnoVremeVidea(trenutnoVreme + 15);
            }

        } else {
            if (trenutnoVreme - 15 < 0) {
                videoPlayer.setTrenutnoVremeVidea(0);
            } else {
                videoPlayer.setTrenutnoVremeVidea(trenutnoVreme - 15);
            }
        }
    }
}
