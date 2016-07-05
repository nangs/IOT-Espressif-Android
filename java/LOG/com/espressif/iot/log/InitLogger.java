package com.espressif.iot.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


// it is generated by python
public class InitLogger {
    public static void init(){
        //######content######
        ConfigureLog4J.configure();
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemoteGetStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceDiscoverLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.rest2.EspMeshUpgradeServer.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.rest2.EspMeshNetUtil2.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceReconnectLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.log.InitLogger.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.timer.DeviceTimersActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.softap_sta_support.SSSActionDeviceUpgradeLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceSynchronizeInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceTimerInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserRegisterInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.sensor.EspCommandSensorGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.log.LogConfigurator.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceConfigureLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.flammable.EspCommandFlammableGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.user.EspUser.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.common.upgrade.EspActionDeviceUpgradeOnline.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewGetInfoLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.configure.DeviceSoftAPConfigureProgressDialog.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.EspDeviceNew.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.humiture.EspCommandHumitureGetStatusListInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTDownloadIdValueDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewConfigureLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightPostStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightGetStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightPostStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugPostStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserLoginInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.humiture.EspCommandHumitureGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.statemachine.EspDeviceStateMachineExecutor.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.log.ReadLogTask.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugGetStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugPostStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.voltage.EspCommandVoltageGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.statemachine.EspDeviceStateMachine.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.longsocket2.EspActionLongSocket.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserLoginDB.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.sensor.EspCommandSensorGetStatusListInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.common.upgrade.EspActionDeviceUpgradeLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.New.EspCommandDeviceNewConfigureLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserLoginDB.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.common.EspActionDeviceConfigureLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.common.EspActionDeviceSynchronizeInterentDiscoverLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.sensor.EspActionSensorGetStatusListInternetDB.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceDeleteInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserLoginInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.group.EspGroupHandler.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceRenameInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTUserDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.cache.EspDeviceCache.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.EspDeviceConfigure.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.cache.EspDeviceCacheHandler.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.statemachine.EspDeviceStateMachineHandler.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.model.device.EspDeviceRoot.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemotePostStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.common.upgrade.EspDeviceCheckCompatibility.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemotePostStatusLocal.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTGenericDataDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemoteGetStatusInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.settings.SettingsFragment.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.voltage.EspCommandVoltageGetStatusListInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.flammable.EspCommandFlammableGetStatusListInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.upgrade.apk.UpgradeManagerApkOnline.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.esppush.EspPushClient.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTGenericDataDirectoryDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.trigger.DeviceTriggerActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.esppush.EspPushService.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.main.EspUIActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.trigger.EspTriggerSettingsFragment.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.register.RegisterActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.main.WelcomeActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.espbutton.EspCommandEspButtonConfigure.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.DeviceActivityAbs.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTApDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.configure.EspButtonCustomKeySettingsActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.DeviceLightActivityOld.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.login.LoginThirdPartyDialog.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.configure.DeviceBrowserWebFragment.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.configure.WifiConfigureActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.db.IOTDeviceDBManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.command.device.New.EspCommandDeviceNewActivateInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.time.EspTimeManager.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewActivateInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.proxy.MeshLog.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.wifi.WifiAdmin.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.threadpool.CachedThreadPool.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserRegisterInternet.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.mdns.MdnsDiscoverUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.rest2.EspMeshDiscoverUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.udp.UdpBroadcastUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.rest2.EspHttpUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.base.net.rest2.EspHttpDownloadUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.light.LightTwinkleActivity.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.light.LightTwinkleServer.class).setLevel(Level.DEBUG);
    }
}