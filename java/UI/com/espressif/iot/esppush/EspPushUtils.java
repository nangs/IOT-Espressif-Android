package com.espressif.iot.esppush;

import android.content.Context;

/**
 * Created by xuxiangjun on 15-9-18.
 */
public final class EspPushUtils {
    private EspPushUtils() {
    }

    public static void startPushService(Context context) {
        if (checkPlayServices(context)) {
//            RegistrationIntentService.register(context);
        } else {
            EspPushService.start(context);
        }
    }

    public static void stopPushService(Context context) {
        EspPushService.stop(context);
    }

    /**
     * Check the device support GMS
     *
     * @param context
     * @return
     */
    private static boolean checkPlayServices(Context context) {
        // Use Android Studio to develop GCM
        return false;
    }
}
