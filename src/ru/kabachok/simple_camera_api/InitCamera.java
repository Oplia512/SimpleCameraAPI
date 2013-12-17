package ru.kabachok.simple_camera_api;

import java.io.File;

import android.hardware.Camera;
import android.os.Environment;

public class InitCamera {
	
	private File storageDir; 
	private String albumName;
	private Camera camera;
	
	public InitCamera(int cameraId){
		camera = Camera.open(cameraId);
	}
	
	public void setAlbumDir(String albumName){
		setAlbumName("DefaulAlbum");
		storageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), getAlbumName());
	}
	
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	

}
