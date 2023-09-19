package d18_09_2023;

public class AudioControl extends Control {

    private boolean menjajJacinu;

    public AudioControl(boolean menjajJacinu) {
        this.menjajJacinu = menjajJacinu;
    }

    public boolean isMenjajJacinu() {
        return menjajJacinu;
    }

    public void setMenjajJacinu(boolean menjajJacinu) {
        this.menjajJacinu = menjajJacinu;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {

        if (menjajJacinu) {
            if (videoPlayer.getJacinaZvuka() + 1 > 100) {
                videoPlayer.setJacinaZvuka(100);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            }
        } else {
            if (videoPlayer.getJacinaZvuka() - 1 < 0) {
                videoPlayer.setJacinaZvuka(0);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            }
        }




    }
}
