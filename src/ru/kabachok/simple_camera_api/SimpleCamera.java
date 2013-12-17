package ru.kabachok.simple_camera_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleCamera {
	
	private InitCamera initCamera;

	private static SimpleCamera inctance = null;

	private SimpleCamera() {
	}

	public void init(InitCamera initCamera){
		this.initCamera = initCamera;
	}
	
	private String setFileName(){
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_mm_ss").format(new Date());
		String fileName = initCamera.getAlbumName() + timeStamp + ".jpg"; 
		return fileName;
	}
	
	public static synchronized SimpleCamera getInstance() {
		if (inctance == null) {
			inctance = new SimpleCamera();
		}
		return inctance;
	}
}
