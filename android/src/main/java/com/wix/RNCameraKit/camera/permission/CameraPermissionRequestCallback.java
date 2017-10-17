package com.wix.RNCameraKit.camera.permission;

import com.wix.RNCameraKit.camera.CameraKitModule;

public class CameraPermissionRequestCallback {

    private CameraKitModule cameraKitModule;

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        cameraKitModule.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void setCameraKitModule(CameraKitModule cameraKitModule) {
        this.cameraKitModule = cameraKitModule;
    }
}
