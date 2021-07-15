package molina.raul.lexi

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class TemaPreguntaVideoActivity : AppCompatActivity() {
    // declaring a null variable for VideoView
    var simpleVideoView: VideoView? = null
    // declaring a null variable for MediaController
    var mediaControls: MediaController? = null

    var url_video = "https://www.youtube.com/watch?v=cw4eESMUMmI";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tema_pregunta_video)


        getSupportActionBar()?.hide();
        getActionBar()?.hide();
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        
        simpleVideoView = findViewById<View>(R.id.mVideoView) as VideoView

        if (mediaControls == null) {
            // creating an object of media controller class
            mediaControls = MediaController(this)

            // set the anchor view for the video view
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }

        // set the media controller for video view
        simpleVideoView!!.setMediaController(mediaControls)
        // set the absolute path of the video file which is going to be played
        simpleVideoView!!.setVideoURI(Uri.parse(url_video))

        simpleVideoView!!.requestFocus()

        // starting the video
        simpleVideoView!!.start()

    }
}