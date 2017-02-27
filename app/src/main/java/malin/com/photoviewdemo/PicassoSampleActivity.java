package malin.com.photoviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.malim.photoview.PhotoView;
import com.malim.photoview.PhotoViewAttacher;


public class PicassoSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        PhotoView photoView = (PhotoView) findViewById(R.id.iv_photo);

        final PhotoViewAttacher attacher = new PhotoViewAttacher(photoView);
        Glide.with(this)
                .load("http://pbs.twimg.com/media/Bist9mvIYAAeAyQ.jpg")
                .into(photoView);
//        Picasso.with(this)
//                .load("http://pbs.twimg.com/media/Bist9mvIYAAeAyQ.jpg")
//                .into(photoView, new Callback() {
//                    @Override
//                    public void onSuccess() {
//                        attacher.update();
//                    }
//
//                    @Override
//                    public void onError() {
//                    }
//                });
    }
}
