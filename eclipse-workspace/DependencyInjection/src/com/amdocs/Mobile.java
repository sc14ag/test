package com.amdocs;

public class Mobile {

	private ICamera camera;
	
	public Mobile (ICamera camera) {
		System.out.println("Mobile overloaded constructor ...");
		this.camera = camera;
	}

	public boolean startPhotoApp() {
		if (camera.on()) {
			System.out.println("Positive code path ...");
			return true;
		}
		else {
			System.out.println("Negative code path ....");
		}
		return false;
	}
}